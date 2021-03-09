public class Summery {
    private double value;
    private String currencyConversion;
// Switching the coin input of the user
    public Summery(double value, String currencyConversion){
        this.value = value;
        switch (currencyConversion) {
            case ("1") -> this.currencyConversion = "USD -> ILS";
            case ("2") -> this.currencyConversion = "ILS -> USD";
            case ("3") -> this.currencyConversion = "ILS -> EURO";
            default -> throw new IllegalStateException("Unexpected value: " + currencyConversion);
        }
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value=value;
    }

    public String getConvertType(){
        return currencyConversion;
    }

    public void setConvertType(String convertType){
        this.currencyConversion =convertType;
    }
}
