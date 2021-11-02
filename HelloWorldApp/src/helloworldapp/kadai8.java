/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author doanh
 */
public class kadai8 {

    public static void main(String[] args) {
        int odd_sum = 0;
        int i = 100;
        while (i < 1000) {
            if (i % 2 != 0) {
                odd_sum += i;
            }
            i++;
        }
        System.out.println("odd_sum= " + odd_sum);
    }
}
