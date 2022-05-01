package calculator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDate extends Number implements Expression{

    private LocalDateTime date;

    /**
     * default constructor with the current date
     */
    public /*constructor*/ MyDate(){
        date = LocalDateTime.now();
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

    public LocalDateTime getDate(){
        return date;
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

}
