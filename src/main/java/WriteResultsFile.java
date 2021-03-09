import javax.xml.transform.Result;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteResultsFile {
    public static void writeLogFile(ArrayList<Summery> convertList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Users\\odedk\\IdeaProjects\\currencyConvertor\\results.txt",true));
        for(Summery i : convertList) {
            try {
                writer.write((i.getValue() + " , " + i.getConvertType())+"\n");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Something went wrong with writing into the results file");
            }
        }
        writer.close();
    }
}
