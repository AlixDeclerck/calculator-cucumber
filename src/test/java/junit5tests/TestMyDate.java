package junit5tests;

import calculator.MyDate;
import calculator.Rational;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestMyDate {

    private final String strDate = "2004/08/31 12:45:06";
    private MyDate myDate1;
    private MyDate myDate2;
    LocalDateTime ldt;

    @BeforeEach
    public void setUp() {
        int year = 2000;
        int month = 4;
        int day = 30;
        int hour = 15;
        int minute = 48;
        int second = 12;
        myDate1 = new MyDate(year, month, day, hour, minute, second);
        ldt = LocalDateTime.now();
        myDate2 = new MyDate(ldt);
    }

    @Test
    public void testEquals() {
        String strDate1 = "2000/07/31 06:30:00";
        MyDate myDate3 = new MyDate(strDate1);
        assertNotEquals(myDate3,myDate2);
        assertEquals(myDate2, myDate2); // Identity check (for coverage, as this should always be true)
        MyDate myDate4 = new MyDate(1970, 7, 30, 14, 15, 00);
        assertNotEquals(myDate3, myDate4);
    }

    @Test
    public void testAddDays(){
        MyDate dt = new MyDate(strDate);
        long days = 2L;
        MyDate mDate = dt.addDays(days);
        assertEquals(new MyDate("2004/09/02 12:45:06"), mDate);
    }

    @Test
    public void testAddHours(){
        MyDate dt = new MyDate(strDate);
        long hours = 3L;
        MyDate mDate = dt.addHours(hours);
        assertEquals(new MyDate("2004/08/31 15:45:06"), mDate);
    }

    @Test
    public void testAddMinutes(){
        MyDate dt = new MyDate(strDate);
        long min = 10L;
        MyDate mDate = dt.addMinutes(min);
        assertEquals(new MyDate("2004/08/31 12:55:06"), mDate);
    }

    @Test
    public void testAddSeconds(){
        MyDate dt = new MyDate(strDate);
        long sec = 50L;
        MyDate mDate = dt.addSeconds(sec);
        assertEquals(new MyDate("2004/08/31 12:45:56"), mDate);
    }

    @Test
    public void testSubstractDays(){
        MyDate dt = new MyDate(strDate);
        long days = 2L;
        MyDate mDate = dt.substractDays(days);
        assertEquals(new MyDate("2004/08/29 12:45:06"), mDate);
    }

    @Test
    public void testSubstractHours(){
        MyDate dt = new MyDate(strDate);
        long hours = 3L;
        MyDate mDate = dt.substractHours(hours);
        assertEquals(new MyDate("2004/08/31 09:45:06"), mDate);
    }

    @Test
    public void testSubstractMinutes(){
        MyDate dt = new MyDate(strDate);
        long min = 10L;
        MyDate mDate = dt.subtractMinutes(min);
        assertEquals(new MyDate("2004/08/31 12:35:06"), mDate);
    }

    @Test
    public void testSubstractSeconds(){
        MyDate dt = new MyDate(strDate);
        long sec = 50L;
        MyDate mDate = dt.substractSeconds(sec);
        assertEquals(new MyDate("2004/08/31 12:44:16"), mDate);
    }

    @Test
    public void testTimeElapsedDays(){
        MyDate startDate = new MyDate("1999/07/31 00:00:00");
        MyDate endDate = new MyDate(LocalDateTime.now());
        assertEquals(startDate.timeElapsedDays(endDate), new Rational(8310));
        assertEquals(endDate.timeElapsedDays(startDate), new Rational(8310));
    }

    @Test
    public void testTimeElapsedHours(){
        MyDate endDate = new MyDate("2022/01/31 00:00:00");
        MyDate startDate = new MyDate("2021/01/31 00:00:00");
        assertEquals(endDate.timeElapsedHours(startDate), new Rational(8760));
        assertEquals(startDate.timeElapsedHours(endDate), new Rational(8760));
    }

    @Test
    public void testTimeElapsedMinutes(){
        MyDate endDate = new MyDate("2022/01/10 15:43:34");
        MyDate startDate = new MyDate("2022/01/10 00:00:00");
        assertEquals(startDate.timeElapsedMinutes(endDate), new Rational(943));
        assertEquals(endDate.timeElapsedMinutes(startDate), new Rational(943));
    }

    @Test
    public void testTimeElapsedSeconds(){
        MyDate endDate = new MyDate("2022/06/01 20:50:03");
        MyDate startDate = new MyDate("2022/05/31 20:50:03");
        assertEquals(startDate.timeElapsedSeconds(endDate), new Rational(86400));
        assertEquals(endDate.timeElapsedSeconds(startDate), new Rational(86400));
    }
}
