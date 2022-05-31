/*
* CanonSpeedUser.java
* 氏名・学籍番号
*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CanonSpeedUser {

    public static void main(String[] args) throws IOException{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        int target = (int)(Math.random()*1000)+1;
        System.out.println("Target at "+target+"m");

        while(true){
            c++;
            System.out.println("Angle fixed at 45 degrees");
            double a = Math.PI*0.25; //use fixed angle 45 degrees
            System.out.print("Input Speed(m/s):");
            double s = Double.parseDouble(buf.readLine());

            double d = (s * s * Math.sin( 2 * a ))/9.8 ;
            System.out.println("Distance = "+d+" m");

            if(d >= target-10 && d <= target+10) break;
            System.out.println("Missed");
        }

        System.out.println("Hit!!!");
        System.out.println(c+" turns to hit");

    }

}
