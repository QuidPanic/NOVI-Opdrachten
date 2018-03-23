package com.company;

import javax.swing.*;


public class Main {

    //main method die de andere methods aanroept wanneer nodig.

    public static void main(String[] args) {

        //aanmaken van variabelen en de Joption pane input vensters

        String exit = "Not the right inputs given";
        String invoer = JOptionPane.showInputDialog(null, "invoer:", "input CF of FC");
        String invoer2 = JOptionPane.showInputDialog(null, "invoer", "aantal graden");
        double graden = Double.parseDouble(invoer2);
        String error = "Wrong inputs were given";

        //hier word een if statement aangemaakt met daarin de flow naar de goede method.

        switch (invoer){
            case "CF":
            //hier word de variable x in de method cf een waarde van uitvoer gegeven
            double uitvoer = cf(graden);
            //de resultaten worden geprint naar het scherm
            JOptionPane.showMessageDialog(null, String.valueOf(uitvoer), "Het aantal graden is", JOptionPane.INFORMATION_MESSAGE);
            break;
                case "FC":
                //hier word de variable q in de method fc een waarde van uitvoer gegeven
                double uitvoer2 = fc(graden);
                //de resultaten worden geprint naar het scherm
                JOptionPane.showMessageDialog(null, String.valueOf(uitvoer2), "Het aantal graden is", JOptionPane.INFORMATION_MESSAGE);
            break;

            default:
            // wanneer er niet een goeie keuze is gemaakt wordt er een error message gegeven.
            JOptionPane.showMessageDialog(null, String.valueOf(error), "Het aantal graden is", JOptionPane.INFORMATION_MESSAGE);
            break;
        }


    }

    //method om celsius om te rekenen naar fahrenheit.

    public static double cf(Double x){
        return x * 1.8 + 32;


    }

    //method om fahrenheit om te rekenen naar celsius.

    public static double fc (Double q){
        return (q - 32) / 1.8;

    }


}


