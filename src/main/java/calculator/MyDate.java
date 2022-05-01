package calculator;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDate extends Number implements Expression{

    private final LocalDateTime date;

    /**
     * default constructor with the current date
     */
    public /*constructor*/ MyDate(){
        date = LocalDateTime.now();
    }

    public /*constructor*/ MyDate(LocalDateTime date){
        this.date = date;
    }

    public /*constructor*/ MyDate(int year, int month, int day, int hour, int minute, int second) {
        super();
        date = LocalDateTime.of(year, month, day, hour, minute, second);
    }

    public /*constructor*/ MyDate(int year, int month, int day, int hour, int minute){
        date = LocalDateTime.of(year, month, day, hour, minute);
    }

    public /*constructor*/ MyDate(String s){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        date = LocalDateTime.parse(s,formatter);
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return date.format(formatter);
    }

    //Two MyNumber expressions are equal if the values they contain are equal
    @Override
    public boolean equals(Object o) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (o == null) return false;

        // If the object is compared to itself then return true
        if (o == this) {
            return true;
        }

        if (o instanceof MyDate myDate) {
            return date.equals(myDate.date);
        } else {
            // If the object is of another type then return false
            return false;
        }

    }


    // The method hashCode() needs to be overridden if the equals method is overridden; otherwise there may be problems when you use your object in hashed collections such as HashMap, HashSet, LinkedHashSet
    @Override
    public int hashCode() {
        return toString().hashCode();
    }


    @Override
    public Number negate() {
        return null;
    }

    @Override
    public Number add(Number val) {
        return null;
    }

    @Override
    public Number subtract(Number val) {
        return null;
    }

    @Override
    public Number multiply(Number val) {
        return null;
    }

    @Override
    public Number divide(Number val) {
        return null;
    }

    @Override
    public MyDate addDays(long day) {
        LocalDateTime res = date.plusDays(day);
        return new MyDate(res);
    }

    @Override
    public MyDate addHours(long hour) {
        LocalDateTime res = date.plusHours(hour);
        return new MyDate(res);
    }

    @Override
    public MyDate addMinutes(long min) {
        LocalDateTime res = date.plusMinutes(min);
        return new MyDate(res);
    }

    @Override
    public MyDate addSeconds(long sec) {
        LocalDateTime res = date.plusSeconds(sec);
        return new MyDate(res);
    }

    @Override
    public MyDate substractDays(long day) {
        LocalDateTime res = date.minusDays(day);
        return new MyDate(res);
    }

    @Override
    public MyDate substractHours(long hour) {
        LocalDateTime res = date.minusHours(hour);
        return new MyDate(res);
    }

    @Override
    public MyDate subtractMinutes(long min) {
        LocalDateTime res = date.minusMinutes(min);
        return new MyDate(res);
    }

    @Override
    public MyDate substractSeconds(long sec) {
        LocalDateTime res = date.minusSeconds(sec);
        return new MyDate(res);
    }

    @Override
    public Number timeElapsedDays(MyDate startDate) {
            long res = Duration.between(date,startDate.date).toDays();
            int finalRes = (int) res;
            return new Rational(Math.abs(finalRes));
    }

    @Override
    public Number timeElapsedHours(MyDate startDate) {
            long res = Duration.between(date,startDate.date).toHours();
            int finalRes = (int) res;
            return new Rational(Math.abs(finalRes));
    }

    @Override
    public Number timeElapsedMinutes(MyDate startDate) {
            long res = Duration.between(date,startDate.date).toMinutes();
            int finalRes = (int) res;
            return new Rational(Math.abs(finalRes));
    }

    @Override
    public Number timeElapsedSeconds(MyDate startDate) {
            long res = Duration.between(date,startDate.date).toSeconds();
            int finalRes = (int) res;
            return new Rational(Math.abs(finalRes));
    }

}
