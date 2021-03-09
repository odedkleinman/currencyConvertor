import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadResultsFile {
// Reading the results file and printing the "log" of conversions
    public static void readLogFile() {
        try {
            File resultFile = new File("D:\\Users\\odedk\\IdeaProjects\\currencyConvertor\\results.txt");
            Scanner myReader = new Scanner(resultFile);
            System.out.println("Your conversion history ");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error has occurred while reading file");
            e.printStackTrace();
        }
    }
}