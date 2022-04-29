package calculator;

import visitor.Visitor;


public abstract class Number implements Expression
{

    protected  /*constructor*/ Number() {
    }

    /**
     * Converts the number to a Real number
     */
    public abstract Real toReal();

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Integer countDepth() {
        return new Integer(0);
    }

    public Integer countOps() {
        return new Integer(0);
    }

    public Integer countNbs() {
        return new Integer(1);
    }

    public abstract Number negate();

    public Number add(Number val){
        if(val instanceof Rational rat){
            return add(rat);
        }else if(val instanceof Real r){
            return add(r);
        }else if(val instanceof Complex c){
            return add(c);
        }
        return null;
    }
    protected abstract Number add(Rational rat);
    protected abstract Number add(Real r);
    protected abstract Number add(Complex c);

    public Number subtract(Number val) {
        return add(val.negate());
    };

    public Number multiply(Number val){
        if(val instanceof Rational rat){
            return multiply(rat);
        }else if(val instanceof Real r){
            return multiply(r);
        }else if(val instanceof Complex c){
            return multiply(c);
        }
        return null;
    }
    protected abstract Number multiply(Rational rat);
    protected abstract Number multiply(Real r);
    protected abstract Number multiply(Complex c);

    public Number divide(Number val){
        if(val instanceof Rational rat){
            return divide(rat);
        }else if(val instanceof Real r){
            return divide(r);
        }else if(val instanceof Complex c){
            return divide(c);
        }
        return null;
    }
    protected abstract Number divide(Rational rat);
    protected abstract Number divide(Real r);
    protected abstract Number divide(Complex c);

    public Number pow(Number val) {
        if(val instanceof Rational rat){
            return pow(rat);
        } else if(val instanceof Real r){
            return pow(r);
        }
        return null;
    }

    protected abstract Number pow(Rational rat);
    protected abstract Number pow(Real r);
}
