public class CoinFactory {
    public static Coin getCoinInstance(Coins coin){
        switch (coin){
            case USD:
                return new USD();
            case ILS:
                return new ILS();
            case EURO:
                return new EURO();
        }
        return null;
    }
}
