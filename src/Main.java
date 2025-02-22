import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String getRJ(String filename)
    {
        try
        {
            File file = new File(filename); // File object for reading input
            Scanner reader = new Scanner(file); // Scanner to read file
            String scriptRJ = "";

            while(reader.hasNextLine())
            {
                scriptRJ += reader.nextLine();
            }
            return scriptRJ;
        }
        catch(FileNotFoundException e)
        {
            String emptyString = null;
            e.printStackTrace();
            return emptyString;
        }
    }

    public static void main(String[] args) throws Exception {
        String script = getRJ("src/script.txt");
        System.out.println(script);
    }
}
