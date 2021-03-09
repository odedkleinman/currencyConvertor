import java.io.Serializable;

public class USD extends Coin implements Serializable {
    private final double value = 3.25;
    @Override
    public double getValue(){
        return value;
    }

    @Override
    public double calculate(double input) {
        return input * getValue();
    }
}
