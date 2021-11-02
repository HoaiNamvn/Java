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
public class kadai7 {
    public static void main(String[] args){
        int even_sum = 0;
        for(int i=100;i<1000;i+=2){
            even_sum += i;
        }
        System.out.println("even sum = " + even_sum);
    }
}
