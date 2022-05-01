package junit5tests;

import calculator.MyDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestMyDate {

    private final int year = 2000;
    private final int month = 4;
    private final int day = 30;
    private final int hour = 15;
    private final int minute = 48;
    private final int second = 12;
    private String strDate = "2004/08/31 12:45:06";
    private MyDate myDate1;
    private MyDate myDate2;
    private MyDate myDate3;

    @BeforeEach
    public void setUp() {
        myDate1 = new MyDate();
        myDate2 = new MyDate(year, month, day, hour, minute, second);
        //myDate3 = new MyDate(strDate);
    }

    @Test
    public void testEquals() {
        // Two distinct Rationals, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(new MyDate(), myDate1);
        // Two Rationals containing a distinct value should not be equal:
        String strDate1 = "2000/07/31 06:30";
        MyDate myDate4 = new MyDate(strDate1);
        //assertNotEquals(myDate4,myDate3);
        assertEquals(myDate2, myDate2); // Identity check (for coverage, as this should always be true)
        MyDate myDate5 = new MyDate(1970, 7, 30, 14, 15);
        assertNotEquals(myDate4, myDate5);

    }


}
