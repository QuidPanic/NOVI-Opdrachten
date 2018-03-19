package com.company;

import javax.swing.*;


public class Main {


    public static void main(String[] args) {
        String exit = "Not the right inputs given";
        String invoer = JOptionPane.showInputDialog(null, "invoer:", "input CF of FC");
        String invoer2 = JOptionPane.showInputDialog(null, "invoer", "aantal graden");
        double graden = Double.parseDouble(invoer2);
        String error = "Wrong inputs were given";
            if (invoer.equals("CF")){

            double uitvoer = cf(graden);

                JOptionPane.showMessageDialog(null, String.valueOf(uitvoer), "Het aantal graden is", JOptionPane.INFORMATION_MESSAGE);

             }
            else if (invoer.equals("FC")){
            double uitvoer = fc(graden);


                JOptionPane.showMessageDialog(null, String.valueOf(uitvoer), "Het aantal graden is", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, String.valueOf(error), "Het aantal graden is", JOptionPane.INFORMATION_MESSAGE);

         }


    }

    public static double cf(Double x){
        return x * 1.8 + 32;


    }

    public static double fc (Double q){
        return (q - 32) / 1.8;

    }


}


