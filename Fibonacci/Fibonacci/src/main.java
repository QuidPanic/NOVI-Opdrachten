/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pieter-Andries
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hier worden de integers met waarden gevuld en vervolgens 
        //door de method telop opgeteld
        int z = telop(0,1);
        int o = telop(1,1);
        int p = telop(1,2);
        int x = telop(2,3);
        int v = telop(3,5);
        int g = telop(5,8);
        int l = telop(8,13);
        //hier worden de integers geprint naar het scherm
        System.out.println(z);
        System.out.println(o);
        System.out.println(p);
        System.out.println(x);
        System.out.println(v);
        System.out.println(g);
        System.out.println(l);
        
    }
    //hier wordt de method telop aangemaakt met een x en y integer
    public static int telop(int x, int y){
    return x + y;
    }
}
    