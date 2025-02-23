import java.util.ArrayList;
import java.util.Random;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class Chromosome extends Letters {
    static Random random = new Random();

    public Chromosome()
    {

    }


    public Chromosome(ArrayList<String[]> KB)
    {
        for (String[] clump : KB)
        {
            String[] clumpCopy;
            int randomNum = random.nextInt(2); // randomly decide inclusion

            if (randomNum == 1)
            {
                copy.setIncluded(true);
                this.add(copy);
            }
            else if (randomNum == 0)
            {
                copy.setIncluded(false);
                this.add(copy);
            }
        }
    }

}
