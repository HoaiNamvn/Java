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
* Bigram.java
* 2-gramを用いて、文章の類似度を計算
*/

public class Bigram{
    public static void main(String[] args){
        String database = "不正パスワードによるログインが検出されたためあなたのアカウントは停止されましたアカウントを有効にするにはパスワードを再設定する必要があります";
        String[] text = {"安全のためアカウントのパスワードを再設定してください",
                         "不正なログインが検出されましたため停止しました"};

        //元のデータベースのバイグラム計算用
        String[] bigram = new String[database.length()-1];
        int[] bigram_count = new int[database.length()-1];
        int last=0;

        //2回以上出現するバイグラム記録用
        String[] database_bigram;
        int[] database_bigram_count;

        //新しい文書のバイグラム計算用
        int[] text_bigram_count;
        
        //データベースのバイグラムを計算
        for(int i=0; i<database.length()-1; i++){
            bigram[i]="";
            boolean found=false;
            String substring = database.substring(i,i+2);
            int index=0;
            for(; index<last; index++){
                if(bigram[index].equals(substring)){ //同じバイグラムがある
                    found=true;
                    break;
                }
            }
            if(!found){ //新しいバイグラムを発見
                bigram[index]=substring;
                last++; //バイグラムの種類を1増やす
            }
            bigram_count[index]++; //このバイグラムを数える
        }

        //2回以上出現したバイグラムを記録
        database_bigram = new String[last];
        database_bigram_count = new int[last];
        int database_last = 0;
        
        System.out.println(database);
        System.out.println("データベースの頻出バイグラム,回数");
        for(int i=0; i<last; i++){
            if(bigram_count[i]>1){
                database_bigram[database_last]=bigram[i];
                database_bigram_count[database_last]=bigram_count[i];
                System.out.println(database_bigram[database_last]+", "+database_bigram_count[database_last]);
                database_last++;
            }
        }

        
        //新しい文書とバイグラム比較
        for(int text_count=0; text_count<text.length; text_count++){
            text_bigram_count = new int[database_last];
            for(int i=0; i<text[text_count].length()-1; i++){
                String substring = text[text_count].substring(i,i+2);
                for(int j=0; j<database_last; j++){
                    if(database_bigram[j].equals(substring)){ //データベースのバイグラムと一致
                        text_bigram_count[j]++; //新しい文書のバイグラム一致数を増やす
                        break; //次のバイグラムを探す
                    }
                }
            }

            System.out.println(text[text_count]);
            System.out.println("バイグラム一致数");
            int total=0;
            for(int i=0; i<text_bigram_count.length; i++){
                total+=text_bigram_count[i];
                System.out.print(text_bigram_count[i]+",");
            }
            System.out.println();
            System.out.println("一致度:"+total);
        }//次の文章
    }
}
