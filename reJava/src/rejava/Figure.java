/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rejava;

/**
 *
 * @author doanh
 */
public class Figure {
    public static void main(String args[]){
        double ans = Figure(4);
        System.out.println("結果は"+ans+ "です");
    }
    public static double Figure(double r){
        double calcArea = r*2*3.14159;
        return calcArea;
    }
}
