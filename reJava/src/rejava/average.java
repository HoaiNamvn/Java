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
public class average {
    public static double average(double x, double y, double z){
        double ans = (x+y+z)/3;
        return ans;
    }
    public static void main(String args[]){
        double average = average(3,4,5);
        System.out.println(average);
    }
}
