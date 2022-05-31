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
* コンピュータ対戦の石取りゲーム(完全ゲーム木解法)
* 先攻後攻選択可能
* 氏名 学籍番号
*/
import java.io.*;

public class NimTree2 {
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("石取りゲーム");
        System.out.println("石は全部で5");
        int stone = 5;
        System.out.println("1回で石はいくつ2個まで取れます");
        int n = 2;
        int count = 1; //手数を数える
        int state = 1;
        boolean skip = false;
        int com = 1; //コンピュータ先攻
        
        System.out.print("どちらが先攻(1:コンピュータ 2:プレイヤー)?");
        if(buf.readLine().equals("2")){
            skip = true;
            com = 2; //コンピュータ後攻
        }
        
        int[] gametree = {1,2,1,2,1,1,1,2,2,2,1,2,1,1,0,1,2,2,0,2,0,0,0,2,0,0,0,0,0,1,0}; //完全ゲーム木の解法配列
        
        while(true){
            int remove=0;

            if(skip==false){
                //コンピュータの番
                System.out.println(count+ "手目 残り石:" +stone);
                System.out.println("ステート:"+state);
                if(gametree[(state*2)]!=com){ //勝ち目
                    remove = 1;
                }else{
                    remove = 2;
                }
                
                System.out.println("私は石を"+remove+"個取る");
                stone = stone - remove;
                if(stone<=0) { //残りの石を全部取った場合
                    System.out.println("私の勝ち!");
                    break;
                }
                count++;
                state = (state*2)+(remove-1); //ステート変更
            }else{
                skip=false;
            }
            
            //ユーザの番
            System.out.println(count+ "手目 残り石:" +stone);
            System.out.println("ステート:"+state);
            System.out.print("いくつ石を取る?");
            remove = Integer.parseInt(buf.readLine());
            stone = stone - remove;
            if(stone<=0) { //残りの石を全部取った場合
                System.out.println("君の勝ち!");
                break;
            }
            count++;
            state = (state*2)+(remove-1); //ステート変更
            
        }//end while
    }//end main()
}//end class

