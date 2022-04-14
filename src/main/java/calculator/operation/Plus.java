package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Number;
import calculator.Operation;

import java.util.List;

final public class Plus extends Operation
{
  
  public /*constructor*/ Plus(List<Expression> elist) throws IllegalConstruction {
  	super(elist);
  	symbol = "+";
  	neutral = 0;
  }

  public Number op(Number l, Number r) {
  	return l.add(r);
  }

    @Override
    public MyBoolean op(MyBoolean a, MyBoolean b) {
        return null;
    }

    @Override
    public MyBoolean op(MyBoolean a) {
        return null;
    }


}
