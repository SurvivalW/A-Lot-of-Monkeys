import java.util.ArrayList;
import java.util.Random;

public class Letters {
    private final ArrayList<String[]> keyboard;

    public Letters()
    {
        keyboard = new ArrayList<>();

        // Add clumps
        keyboard.add(new String[]{"q", "w", "a", "s"});
        keyboard.add(new String[]{"e", "r", "d", "f"});
        keyboard.add(new String[]{"t", "y", "g", "h"});
        keyboard.add(new String[]{"u", "i", "j", "k"});
        keyboard.add(new String[]{"o", "p", "l", "k"});
        keyboard.add(new String[]{"z", "x", "s", "d"});
        keyboard.add(new String[]{"c", "v", "f", "g"});
        keyboard.add(new String[]{"b", "n", "h", "j"});
        keyboard.add(new String[]{"m", "n", "j", "k"});
    }

    /**
     * This makes a copy of a random clump
     * Then returns a random key from the clump
     * @return
     */
    public String getRandomKey()
    {
        Random rand = new Random();
        String[] randomClump = keyboard.get(rand.nextInt(keyboard.size())); // Pick a clump
        return randomClump[rand.nextInt(randomClump.length)]; // Pick a random key from that clump
    }

    public ArrayList<String[]> getKeyboard()
    {
        return keyboard;
    }
}
