import javax.xml.transform.Result;
import java.io.IOException;
import java.util.ArrayList;


public class Convertor {


    public static void main(String[] args) throws IOException {
        double input, value;
        String choice;
        ArrayList<Summery> convertList = new ArrayList<>(); //Create an ArrayList to save the results
        System.out.println("Welcome to currency converter");
        do {
            choice = WelcomeScreen.firstScreen();
            //Choosing the currency to convert
            switch (choice) {
                case ("1") -> {
                    input = ChoiseScreen.choiseScreen();
                    Coin usd = CoinFactory.getCoinInstance(Coins.USD);
                    assert usd != null;
                    value = usd.calculate(input);
                    System.out.println(input + " dollars equals to " + value + " shekel"); //Print the calculated value
                    convertList.add(new Summery(input,choice)); //Add results to Results File
                }
                case ("2") -> {
                    input = ChoiseScreen.choiseScreen();
                    Coin ils = CoinFactory.getCoinInstance(Coins.ILS);
                    assert ils != null;
                    value = ils.calculate(input);
                    System.out.println(input + " shekels equals to " + value + " dollars"); //Print the calculated value
                    convertList.add(new Summery(input,choice)); //Add results to Results File
                }
                case ("3") -> {
                    input = ChoiseScreen.choiseScreen();
                    Coin euro = CoinFactory.getCoinInstance(Coins.EURO);
                    assert euro != null;
                    value = euro.calculate(input);
                    System.out.println(input + " Shekels equals to " + value + " euros"); //Print the calculated value
                    convertList.add(new Summery(input,choice)); //Add results to Results File
                }
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }

        } while (EndScreen.startAgain());
        WriteResultsFile.writeLogFile(convertList);
        ReadResultsFile.readLogFile();
    }
}
