/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doanh
 */
/*
    MasterMindInduction.java
    仮説推論を用いた2進数マスターマインド
    学籍番号 氏名
    日付
*/

import java.io.*;

public class MasterMindInduction{

    public static void main(String[] args) throws IOException{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("2進数仮説推論マスターマインド");

        System.out.println("5桁の2進数の答えを入力してください。(00000 〜 11111)");
        String answerString = buf.readLine();

        int DIGITS = 5; //答えは5桁
        int[] answer = new int[DIGITS];
        for(int i=0; i<answer.length; i++){
            answer[i]= Integer.parseInt(answerString.substring(i,i+1));
        }

        int TRIES = 6; //予想は6回まで
        int[][] fact = new int[TRIES][DIGITS+1]; //推論事実ベース

        int[] guess = new int[answer.length]; //コンピュータの予想

        int count;
        for(count = 0; count < TRIES; count++){
            while(true){ //推論が成功するまで
                for(int i=0; i<guess.length; i++){
                    guess[i]= (int)(Math.random()*2); //乱数で予想
                }
                boolean induction=true;
                for(int j=0; j<count; j++){ //推論事実ベースを確認
                    int hit=0;
                    //予想が正解の場合の当たり数を計算
                    for(int i=0; i<guess.length; i++){
                        if(guess[i]==fact[j][i]){
                            hit++;
                        }
                    }
                    if(hit!=fact[j][guess.length]){ //当たり数が一致しているか
                        //推論矛盾
                        induction=false;
                        break; //もう一度別の予想で推論
                    }
                }
                if(induction==true){ //矛盾がなかった
                    break; //現在の予想を使う
                }
            }

            System.out.print((count+1)+"回目のコンピュータの予想:");
            for(int i=0; i<guess.length; i++){
                System.out.print(guess[i]);
            }
            System.out.println();

            //あたり数を計算
            int hit = 0;
            for(int i=0; i<guess.length; i++){
                if(guess[i]==answer[i]){
                    hit++;
                }
            }
            System.out.println("当たりの数は"+hit);

            //推論事実ベースを追加
            for(int i=0; i<guess.length; i++){
                fact[count][i]=guess[i];
            }
            fact[count][guess.length]=hit;

            //すべて当たりの場合
            if(hit == answer.length){
                System.out.println("コンピュータの予想的中!");
                break;
            }

        }//end for

        //予想が回数内で当たらなかった場合
        if(count==TRIES){
            System.out.println("コンピュータの負け!?");
        }

        System.out.println("おわり");

    }//end main

}

