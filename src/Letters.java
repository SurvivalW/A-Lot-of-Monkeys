import java.lang.reflect.Array;
import java.util.ArrayList;

public class Letters {
    // The entire keyboard holding all the clumps of letters
    ArrayList<String[]> keyBoard = new ArrayList<>();

    // Clumps of letters
    String[] clump1 = new String[4];
    String[] clump2 = new String[4];
    String[] clump3 = new String[4];
    String[] clump4 = new String[4];
    String[] clump5 = new String[4];
    String[] clump6 = new String[4];
    String[] clump7 = new String[4];
    String[] clump8 = new String[4];
    String[] clump9 = new String[4];

    public void keyBoard()
    {
        //clump 1
        clump1[0] = "q";
        clump1[1] = "w";
        clump1[2] = "a";
        clump1[3] = "s";

        //clump 2
        clump2[0] = "e";
        clump2[1] = "r";
        clump2[2] = "d";
        clump2[3] = "f";

        //clump 3
        clump3[0] = "t";
        clump3[1] = "y";
        clump3[2] = "g";
        clump3[3] = "h";

        //clump 4
        clump4[0] = "u";
        clump4[1] = "i";
        clump4[2] = "j";
        clump4[3] = "k";

        //clump 5
        clump5[0] = "o";
        clump5[1] = "p";
        clump5[2] = "l";
        clump5[3] = "k";

        //clump 6
        clump6[0] = "z";
        clump6[1] = "x";
        clump6[2] = "s";
        clump6[3] = "d";

        //clump 7
        clump7[0] = "c";
        clump7[1] = "v";
        clump7[2] = "f";
        clump7[3] = "g";

        //clump 8
        clump8[0] = "b";
        clump8[1] = "n";
        clump8[2] = "h";
        clump8[3] = "j";

        //clump 9
        clump9[0] = "m";
        clump9[1] = "n";
        clump9[2] = "j";
        clump9[3] = "k";

        //add all clumps to keyboard
        keyBoard.add(clump1);
        keyBoard.add(clump2);
        keyBoard.add(clump3);
        keyBoard.add(clump4);
        keyBoard.add(clump5);
        keyBoard.add(clump6);
        keyBoard.add(clump7);
        keyBoard.add(clump8);
        keyBoard.add(clump9);
    }
}
