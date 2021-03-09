import java.util.Scanner;

public class EndScreen {

    static boolean startAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to convert more?");
        System.out.println("Y is yes");
        System.out.println("N is no");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("y")) {
            return true;
        } else if(choice.equalsIgnoreCase("n")) {
            return false;
        }else
        {
            System.out.println("Invalid Choice, please try again");
            return startAgain();
        }

    }
}
