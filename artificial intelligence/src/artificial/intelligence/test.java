/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificial.intelligence;

import java.io.*;

/**
 *
 * @author doanh
 */
public class test {

    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader buf
                = new BufferedReader(new InputStreamReader(System.in));
        s = buf.readLine();
        int i = Integer.parseInt(s);
        System.out.print( 20 + i);
    }

}
