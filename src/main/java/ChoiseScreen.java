import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoiseScreen {
    public static double choiseScreen(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter an amount to convert");
            return scan.nextDouble();
        }catch (InputMismatchException in){
            System.out.println("Invalid Choice, please try again");
            return ChoiseScreen.choiseScreen();
        }
    }
}
