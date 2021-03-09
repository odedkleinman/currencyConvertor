public class ChoiceValidator {
// Validate the coin choice 1/2/3 of the user input
    public static boolean InputValidator(String choice) {
        return (choice.equals("1") || choice.equals("2") || choice.equals("3"));
    }
}