package com.company;
import javax.swing.*;
import javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {
        double uitvoer;
        String invoer = JOptionPane.showInputDialog(null, "invoer:", "input CF of FC");
        String invoer2 = JOptionPane.showInputDialog(null, "invoer", "aantal graden");
        double graden = Double.parseDouble(invoer2);


        if (invoer.equals("CF")) {

            uitvoer = graden * 1.8 + 32;

            }
        else if (invoer.equals("FC")) {
            uitvoer = (graden - 32) / 1.8;
            }
        else {
         uitvoer = 0;
        }
        JOptionPane.showMessageDialog(null, String.valueOf(uitvoer), "Het aantal graden is", JOptionPane.INFORMATION_MESSAGE);
    }
}