package junit5tests;

import static org.junit.jupiter.api.Assertions.*;

import calculator.*;
import org.junit.jupiter.api.*;

import java.util.List;

public class TestParser {


    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testParseInteger() {
        String expr = "5";
        assertEquals(new Rational(5), Parser.parse(expr));
    }

    @Test
    public void testParseSmallScientific() {
        String expr = "8e-5";
        assertEquals(new Rational(8, 100000), Parser.parse(expr));
    }

    @Test
    public void testParseBigScientific() {
        String expr = "8e5";
        assertEquals(new Rational(800000), Parser.parse(expr));
    }

    @Test
    public void testParseScientificShortcut() {
        String expr1 = "8e+5";
        String expr2 = "8e5";
        assertEquals(Parser.parse(expr1), Parser.parse(expr2));
    }

    @Test
    public void testParseScientificCaseInsensitive() {
        String expr1 = "8e5";
        String expr2 = "8E5";
        assertEquals(Parser.parse(expr1), Parser.parse(expr2));
    }


    @Test
    public void testParseDecimalScientific() {
        String expr = "8.2e3";
        assertEquals(new Rational(8200), Parser.parse(expr));
    }


    /*
    @Test
    public void testParseDecimal() {
        fail(); // Not yet implemented
    }

    @Test
    public void testParseImaginary() {
        fail(); // Not yet implemented
    }
    */

    @Test
    public void testParseAddition() throws Exception {
        String expr = "1+2";
        assertEquals(
                new Plus(List.of(new Rational(1), new Rational(2))),
                Parser.parse(expr)
        );
    }

    @Test
    public void testParseDifference() throws Exception {
        String expr = "1-2";
        assertEquals(
                new Minus(List.of(new Rational(1), new Rational(2))),
                Parser.parse(expr)
        );
    }

    @Test
    public void testParseMultiplication() throws Exception {
        String expr = "1×2";
        assertEquals(
                new Times(List.of(new Rational(1), new Rational(2))),
                Parser.parse(expr)
        );
    }

    @Test
    public void testParseDivision() throws Exception {
        String expr = "1/2";
        assertEquals(
                new Divides(List.of(new Rational(1), new Rational(2))),
                Parser.parse(expr)
        );
    }

    @Test
    public void testParsePriority() throws Exception {
        String expr = "1 + 2 × 3";
        assertEquals(
                new Plus(List.of(new Rational(1),
                        new Times(List.of(new Rational(2), new Rational(3))))),
                Parser.parse(expr)
        );
    }

    @Test
    public void testParseParentheses() throws Exception {
        String expr = "(1 + 2) × 3";
        assertEquals(
                new Times(List.of(
                    new Plus(List.of(new Rational(1), new Rational(2))),
                    new Rational(3))),
                Parser.parse(expr)
        );
    }
}
