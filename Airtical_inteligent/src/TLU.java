/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doanh
 */
//Threshold logic unit with error correction

import java.lang.*;
import java.io.*;
import java.util.*;

public class TLU {
    public static void main(String[] args){
        //形式ニューロンの発火関数
        //z = 1 if((x1*w1+x2*w2)>=T)
        //z = 0 if((x1*w1+x2*w2)<T)
    
        int x1; //input1 入力1
        int x2; //input2 入力2
        int z;  //output 出力
        int w1 = 0; //weight1 重み1
        int w2 = 0; //weight2 重み2
        int T = 0; //threshold 閾値
        int d; //教師データ
        int delta = 1; //training constant 重み修正量

        int[][] NAND={{0,0,1},
                      {0,1,1},
                      {1,0,1},
                      {1,1,0}};

        int counter=0;
        boolean correct=true;
        System.out.println("w1:"+w1+"  w2:"+w2+"  T:"+T);

        while(true){
            System.out.print("["+counter+"] ");

            x1=NAND[counter%4][0];
            x2=NAND[counter%4][1];
            d=NAND[counter%4][2];

            System.out.print("x1:"+x1+" x2:"+x2);

            //Feed forward 出力計算
            if( x1*w1 + x2*w2 >= T ){
                z = 1;
            }else{
                z = 0;
            }
            System.out.print(" z:"+z);

            //Training data 教師信号
            System.out.print(" d:"+d);

            if(z != d){ //教師と出力を比較
                correct=false; //学習を続ける
            }
            
            //Threshold Error correction 閾値修正
            if(d-z > 0){ //出力zが小さい->閾値を下げる
                T=T-delta;
            }
            if(d-z < 0){ //出力zが大きい->閾値を上げる
                T=T+delta;
            }
            
            //Weight Error correction 重み修正
            if(x1*(d-z) > 0){ //出力zが小さい->w1を上げる
                w1=w1+delta;
            }
            if(x1*(d-z) < 0){ //出力zが大きい->w1を下げる
                w1=w1-delta;
            }
            if(x2*(d-z) > 0){ //出力zが小さい->w2を上げる
                w2=w2+delta;
            }
            if(x2*(d-z) < 0){ //出力zが大きい->w2を下げる
                w2=w2-delta;
            }

            System.out.println(" w1:"+w1+" w2:"+w2+" T:"+T);
            if(counter%4==3) { //真理値表の最後なら
                if(correct==true){ //全て正解なら
                    break; //ループから脱出
                }
                correct=true; //初めから
            }
            counter++;
        }//end while
    }//end main
}//end class

