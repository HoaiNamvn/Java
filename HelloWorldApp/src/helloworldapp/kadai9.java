/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Arrays;
/**
 *
 * @author doanh
 */
public class kadai9 {

    public static void main(String[] args) {
        double arrays[];
        arrays = new double[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Math.random();
        }
        Arrays.sort(arrays);
        System.out.println("Max　= " + arrays[arrays.length - 1] + "at index " + (arrays.length - 1));

    }
}
