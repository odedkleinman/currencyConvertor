import java.io.Serializable;

public class EURO extends Coin implements Serializable {
    private final double value = 4.23;
// methods to return the value of EURO and calculate ILS->Euro
    @Override
    public double getValue(){
        return value;
    }

    @Override
    public double calculate(double input){
        return input/getValue();
    }
}
