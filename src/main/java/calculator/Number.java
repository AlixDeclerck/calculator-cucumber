package calculator;

import visitor.Visitor;


public abstract class Number implements Expression
{

    protected  /*constructor*/ Number() {
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Integer countDepth() {
        return 0;
    }

    public Integer countOps() {
        return 0;
    }

    public Integer countNbs() {
        return 1;
    }

    public abstract Number negate();

    public abstract Number add(Number val);

    public abstract Number subtract(Number val);

    public abstract Number multiply(Number val);

    public abstract Number divide(Number val);

    public abstract MyDate addDays(long day);
    public abstract MyDate addHours(long hour);
    public abstract MyDate addMinutes(long min);
    public abstract MyDate addSeconds(long sec);
    public abstract MyDate substractDays(long day);
    public abstract MyDate substractHours(long hour);
    public abstract MyDate subtractMinutes(long min);
    public abstract MyDate substractSeconds(long sec);
    public abstract Number timeElapsedDays(MyDate endDate);
    public  abstract Number timeElapsedHours(MyDate endDate);
    public  abstract Number timeElapsedMinutes(MyDate endDate);
    public abstract Number timeElapsedSeconds(MyDate endDate);









}
