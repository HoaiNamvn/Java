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
public class kadai10 {

    public static void main(String[] args) {
        double arrays[];
        arrays = new double[10];
        // insert
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Math.random();

        }

        // show
        System.out.println(Arrays.toString(arrays));

        // rev
        
for (int f = 0, l = arrays.length - 1; f < l; f++, l--){
  double temp = arrays[f];
  arrays[f]  = arrays[l];
  arrays[l] = temp;
}
        //show
        System.out.println(Arrays.toString(arrays));
    }
}
