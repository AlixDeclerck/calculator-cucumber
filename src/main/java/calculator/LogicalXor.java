package calculator;

import java.util.List;

public class LogicalXor extends Operation {



    public LogicalXor(List<Expression> elist) throws IllegalConstruction {
        super(elist);
        symbol = "XOR";
    }

    @Override
    public Number op(Number l, Number r) {
        return null;
    }

    @Override
    public MyBoolean op(MyBoolean a, MyBoolean b) {
        return new MyBoolean(a.getValue() ^ b.getValue());
    }

    @Override
    public MyBoolean op(MyBoolean a) {
        return new MyBoolean(false);
    }


}
