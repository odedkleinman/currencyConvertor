public abstract class Coin implements ICalculate{
    public abstract double getValue();
// methods to get the value of the coins and calculating the conversion
    @Override
    public abstract double calculate(double value);
}
