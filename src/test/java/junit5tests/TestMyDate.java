package junit5tests;

import calculator.MyDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestMyDate {

    private final int year1 = 2000;
    private final int month1 = 4;
    private final int day1 = 31;
    private final int hour1 = 15;
    private final int minute1 = 48;
    private final int second1 = 12;
    private MyDate myDate1;
    private MyDate myDate2;

    @BeforeEach
    public void setUp() {
        myDate1 = new MyDate();
        myDate2 = new MyDate(year1, month1, day1, hour1, minute1, second1);
    }

    @Test
    public void testEquals() {
        // Two distinct Rationals, constructed separately (using a different constructor) but containing the same value should be equal
        //assertEquals(new MyDate(), myDate1);
        // Two Rationals containing a distinct value should not be equal:
        int year2 = 1971;
        int month2 = 7;
        int day2 = 20;
        int hour2 = 23;
        int minute2 = 30;
        int second2 = 45;
        MyDate myDate3 = new MyDate(year2, month2, day2, hour2, minute2, second2);
        assertNotEquals(myDate3,myDate1);
        assertEquals(myDate2, myDate2); // Identity check (for coverage, as this should always be true)
        MyDate myDate4 = new MyDate(year1, month1, day1);
        MyDate myDate5 = new MyDate(year1, month1, day1, hour1, minute1);
        assertNotEquals(myDate4, myDate5);

    }


}
