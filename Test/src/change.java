/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doanh
 */
public class change {

    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        int c = b; //c = 6
        b = a; //b= 5
        a = c; // a=6 
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
