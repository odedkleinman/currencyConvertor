import java.util.Scanner;

public class WelcomeScreen {
    public static String firstScreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose an option (1/2/3)");
        System.out.println("1. Dollars to Shekels \n2. Shekeles to Dollars \n3. Shekels to Euros");
        String inputUser = scan.next();
        while (ChoiceValidator.InputValidator(inputUser)==false) {
            System.out.println("Invalid Choice, please try again");
            inputUser = scan.next();
        }
        return inputUser;
    }

}
