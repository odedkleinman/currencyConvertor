import java.io.Serializable;

public class EURO extends Coin implements Serializable {
    private final double value = 4.23;

    @Override
    public double getValue(){
        return value;
    }

    @Override
    public double calculate(double input){
        return input/getValue();
    }
}
