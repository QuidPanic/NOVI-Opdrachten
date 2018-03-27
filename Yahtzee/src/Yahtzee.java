import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Yahtzee {

    public static void main (String[] args){ //main program that uses method dice to throw six dices
        int[] throwDice = new int[6];

        for (int d = 0; d < 6 ; d++) { // We have 6 turns
            for (int a = 0; a < 6 ; a++) { // we are throwing the dice 6 times
                throwDice[a] = dice();
            }

            JOptionPane.showMessageDialog(null, Arrays.toString(throwDice), "uitvoer", JOptionPane.INFORMATION_MESSAGE); //Convert array to string and Print result to screen


        }
    }

    public static int dice() { //This will be the dice with an integer value of 1 to 6
        Random rand = new Random();

        return rand.nextInt(6) +1;

    }

}
