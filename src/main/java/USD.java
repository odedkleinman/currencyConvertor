import java.io.Serializable;

public class USD extends Coin implements Serializable {
    private final double value = 3.52;
    @Override
    public double getValue(){  //returns the final value of USD
        return value;
    }

    @Override
    public double calculate(double input) {  //calculate the conversion of USD/ILS
        return input * getValue();
    }
}
