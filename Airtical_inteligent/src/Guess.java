/*
* 数当てゲーム
*/
// import package io.*
import java.io.*;
public class Guess{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
       // 1～100 の間の数字をランダムで決める。
        int answer = (int)(Math.random()*100)+1;
        System.out.println("1から100までの数値を考えた。");

        int count=1;
        while(true){
            int guess=0;

            while(guess==0){ //入力エラーチェック
                System.out.print("いくつだと思う？");
                try{
                    guess=Integer.parseInt(buf.readLine());
                }catch(Exception e){
                    continue;
                }
            }

            if(guess==answer) break; //当たり

            if(guess<answer){
                System.out.println("もっと大きい");
            }else{
                System.out.println("もっと小さい");
            }
            count++;
        }
        System.out.println(count+"回で当てた");
    }
}
