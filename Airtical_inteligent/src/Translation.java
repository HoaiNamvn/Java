/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doanh
 */
import java.util.*;

public class Translation{
    public static void main(String[] args){
        //英語の文
        String[][] english = {
            {"This","is","a","pen"},
            {"I","have","a","pen"},
            {"The","apple","is","ripe"},
            {"I","eat","an","apple"},
            {"I","have","a","pineapple"}
        };

        //日本語の訳
        String[][] japanese = {
            {"これ","は","ペン","です"},
            {"私","は","ペン","を","持っている"},
            {"この","リンゴ","は","熟れている"},
            {"私","は","リンゴ","を","食べる"},
            {"私","は","パイナップル","を","持っている"}
        };

        //機械翻訳対象の英文
        String[] input = {"I","have","an","apple"};

        //英語の単語の種類を数える
        int englishwords = 0;
        for(int i=0; i<english.length; i++){
            for(int j=0; j<english[i].length; j++){
                boolean found=false;
                for(int k=0; k<=i; k++){
                    for(int l=0; l<english[k].length; l++){
                        if(k==i && l==j){
                            break;
                        }
                        if(english[i][j].equals(english[k][l])){
                            found=true; //重複した単語
                            break;
                        }
                    }
                }
                if(found==false){
                    englishwords++; //新しい単語
                }
            }
        }
        System.out.println("英語単語数:"+englishwords);

        //日本語の単語の種類を数える
        int japanesewords = 0;
        for(int i=0; i<japanese.length; i++){
            for(int j=0; j<japanese[i].length; j++){
                boolean found=false;
                for(int k=0; k<=i; k++){
                    for(int l=0; l<japanese[k].length; l++){
                        if(k==i && l==j){
                            break;
                        }
                        if(japanese[i][j].equals(japanese[k][l])){
                            found=true; //重複した単語
                            break;
                        }
                    }
                }
                if(found==false){
                    japanesewords++; //新しい単語
                }
            }
        }
        System.out.println("日本語単語数:"+japanesewords);

        String[] columns = new String[englishwords]; //テーブルの列ラベル
        String[] rows = new String[japanesewords]; //テーブルの行ラベル
        
        //テーブルの列ラベルを作成
        int columncount=0;
        for(int i=0; i<english.length; i++){
            for(int j=0; j<english[i].length; j++){
                boolean found=false;
                for(int k=0; k<columncount; k++){
                    if(english[i][j].equals(columns[k])){
                        found=true; //すでに登録済み
                        break;
                    }
                }
                if(found==false){
                    columns[columncount]=english[i][j]; //新しい単語をラベルとして登録
                    columncount++;
                }
            }
        }

        //テーブルの行ラベルを作成
        int rowcount=0;
        for(int i=0; i<japanese.length; i++){
            for(int j=0; j<japanese[i].length; j++){
                boolean found=false;
                for(int k=0; k<rowcount; k++){
                    if(japanese[i][j].equals(rows[k])){
                        found=true; //すでに登録済み
                        break;
                    }
                }
                if(found==false){
                    rows[rowcount]=japanese[i][j]; //新しい単語をラベルとして登録
                    rowcount++;
                }
            }
        }

        //出現組み合わせテーブルの作成
        int[][] table = new int[japanesewords][englishwords]; //出現組み合わせテーブル
        for(int i=0; i<english.length; i++){ //英語の文を巡回
            for(int j=0; j<english[i].length; j++){ //英単語づつ巡回
                for(int k=0; k<columns.length; k++){ //列ラベル(英語ラベル)巡回
                    if(columns[k].equals(english[i][j])){ //一致
                        for(int l=0; l<japanese[i].length; l++){ //対応する日本語の単語巡回
                            for(int m=0; m<rows.length; m++){ //行ラベル(日本語ラベル)巡回
                                if(rows[m].equals(japanese[i][l])){ //一致
                                    table[m][k]++; //table[japanese][english]
                                }
                            }
                        }
                    }
                }
            }
        }
                                
        //組み合わせテーブルの表示
        System.out.print(" ,");
        //列ラベルを表示
        for(int i=0; i<columns.length; i++){
            System.out.print(columns[i]+",");
        }
        System.out.println();
        //テーブルの内容表示
        for(int i=0; i<table.length; i++){
            System.out.print(rows[i]+","); //行ラベル表示    
            for(int j=0; j<table[i].length; j++){
                System.out.print(table[i][j]+",");
            }
            System.out.println();
        }
        System.out.println();

        //翻訳対象の英文表示
        System.out.println("未知の文");
        for(int i=0; i<input.length; i++){
            System.out.print(input[i]+",");
        }
        System.out.println();

        //翻訳対象の英文の訳を生成
        String[] translation = new String[japanesewords];
        int translationcount=0;
        for(int i=0; i<input.length; i++){
            for(int j=0; j<columns.length; j++){
                if(columns[j].equals(input[i])){ //一致
                    for(int k=0; k<rows.length; k++){
                        if(table[k][j]>1){ //可能性あり
                            boolean found=false;
                            for(int l=0; l<translationcount; l++){
                                if(rows[k].equals(translation[l])){ //すでに登録済み
                                    found=true;
                                    break;
                                }
                            }
                            if(found==false){ //新しい訳の候補を追加
                                translation[translationcount]=rows[k];
                                translationcount++;
                            }
                        }
                    }
                }
            }
        }

        //翻訳結果を表示
        System.out.println("翻訳");
        for(int i=0; i<translationcount; i++){
            System.out.print(translation[i]+",");
        }
        System.out.println();
        
    }
}

