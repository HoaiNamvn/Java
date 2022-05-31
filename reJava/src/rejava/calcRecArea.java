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
public class calcRecArea {

    static double calcRecAre(double l, double s) {
        double area = l * s;
        return area;
    }

    public static void main(String args[]) {
        double ans = calcRecAre(9, 6);
        System.out.println(ans);
    }
}
