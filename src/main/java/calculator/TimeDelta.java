package calculator;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeDelta extends Number{

    private int days;
    private int hours;
    private int minutes;
    private int seconds;

    public /*constructor*/ TimeDelta(){
        days = 0;
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public /*constructor*/ TimeDelta(int days, int hours, int minutes, int seconds){
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public long timeElapsedDays(MyDate startDate, MyDate endDate){
        return Duration.between(startDate.getDate(),endDate.getDate()).toDays();
    }

    public long timeElapsedHours(MyDate startDate, MyDate endDate){
        return Duration.between(startDate.getDate(),endDate.getDate()).toHours();
    }

    public long timeElapsedMinutes(MyDate startDate, MyDate endDate){
        return Duration.between(startDate.getDate(),endDate.getDate()).toMinutes();
    }

    public long timeElapsedSeconds(MyDate startDate, MyDate endDate){
        return Duration.between(startDate.getDate(),endDate.getDate()).toSeconds();
    }

    public LocalDateTime addDays(MyDate date, long day){
        return date.getDate().plusDays(day);
    }

    public LocalDateTime substractDays(MyDate date, long day){
        return date.getDate().minusDays(day);
    }


    public LocalDateTime addHours(MyDate date, long hour){
        return date.getDate().plusHours(hour);
    }

    public LocalDateTime addMinutes(MyDate date, long min){
        return date.getDate().plusMinutes(min);
    }

    public LocalDateTime addSeconds(MyDate date, long second){
        return date.getDate().plusSeconds(second);
    }

    public LocalDateTime substractHours(MyDate date, long hour){
        return date.getDate().minusHours(hour);
    }

    public LocalDateTime substractMinutes(MyDate date, long min){
        return date.getDate().minusMinutes(min);
    }

    public LocalDateTime substractSeconds(MyDate date, long second){
        return date.getDate().minusSeconds(second);
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
