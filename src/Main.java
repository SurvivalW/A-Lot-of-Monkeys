import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Letters {

    public String getRJ(String filename)
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


    public static ArrayList<Chromosome> initializePopulation(ArrayList<String[]> keyBoard, int populationSize)
    {
        ArrayList<Chromosome> population = new ArrayList<Chromosome>();

        for(int i = 0; i < populationSize; i++)
        {
            population.add(new Chromosome(keyBoard));
        }
        return population;
    }

    public void main(String[] args) throws Exception {
        
        String script = getRJ("src/script.txt");
        



    }
}
