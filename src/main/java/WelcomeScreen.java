import java.util.Scanner;

public class WelcomeScreen {
    public static String firstScreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose an option (1/2/3)");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekeles to Dollars");
        System.out.println("3. Shekels to Euros");
        String inputUser = scan.next();
        while (ChoiceValidator.InputValidator(inputUser)==false) {
            System.out.println("Wrong choice, choose again ");
            inputUser = scan.next();
        }
        return inputUser;
    }

}
