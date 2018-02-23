/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pieter-Andries
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //waarde gegeven aan rechthoek
     int z = oppervlakte(5,5);
     //waarde gegeven aan cirkel
     double o = oppervlakte((int) 2.4);
     //waardes z en o worden geprint naar het scherm
     System.out.println(z);
     System.out.println(o);
    } 
    //method voor de rechthoek
    public static int oppervlakte(int x, int y){
        return x * y;
        }
    //method voor de cirkel
    public static double oppervlakte(int p){
        return p * p * 3.14;
    
    }
}


