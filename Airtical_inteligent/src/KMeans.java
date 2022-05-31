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
* KMeans.java
* k平均法で3次元データをクラスタリングする
*/

import java.util.*;
public class KMeans {
    public static void main(String[] args){
    //クラスタリング対象3次元データ
    int[][] data = {{52,10,45},
            {169,163,145},
            {47,203,23},
            {49,243,213},
            {144,174,65},
            {171,149,196},
            {196,175,224},
            {237,88,116},
            {87,233,83},
            {199,97,193}};
    int k = 3; //クラスタ数
    long SEED = 0; //乱数シード

    double[][] center = new double[k][3]; //クラスタ中心座標(x,y,z)
    int[] cluster = new int[data.length]; //データのクラスタ属性

    //初期化
    //Random random = new Random(SEED); //乱数生成クラス
    Random random = new Random(); //乱数生成クラス
    for(int c=0; c<k; c++){
        center[c][0] = random.nextDouble()*256; //クラスタ中心x座標
        center[c][1] = random.nextDouble()*256; //クラスタ中心y座標
        center[c][2] = random.nextDouble()*256; //クラスタ中心z座標
    }
    for(int i=0; i<data.length; i++){
        cluster[i] = -1;
    }

    boolean changed=true; //終了フラグ
    while(changed){
        changed = false;
        for(int i=0; i<data.length; i++){
        //クラスタ中心との距離を計算
        double[] d=new double[k];
        for(int c=0; c<k; c++){
            double dx = (data[i][0]-center[c][0]);
            double dy = (data[i][1]-center[c][1]);
            double dz = (data[i][2]-center[c][2]);
            d[c]=Math.sqrt((dx*dx)+(dy*dy)+(dz*dz));//ユークリッド距離
        }
        //最も近いクラスタ中心を探す
        double nearestd = d[0];
        int nearest = 0;
        for(int c=1; c<k; c++){
            if(d[c]<nearestd){
            nearestd=d[c];
            nearest=c;
            }
        }
        if(cluster[i]!=nearest){ //クラスタ変更
            cluster[i]=nearest;
            changed = true; //クラスタ変更フラグ
        }
        }

        //クラスタ中心座標の再計算
        int[] count = new int[k]; //クラスタ毎の点の数(母数)
        for(int c=0; c<k; c++){
        center[c][0]=0;
        center[c][1]=0;
        center[c][2]=0;
        }
        for(int i=0; i<data.length; i++){
        center[cluster[i]][0]+=data[i][0];//x座標加算
        center[cluster[i]][1]+=data[i][1];//y座標加算
        center[cluster[i]][2]+=data[i][2];//z座標加算
        count[cluster[i]]++;//母数加算
        }
        //母数で割って平均座標に変換
        for(int c=0; c<k; c++){
        if(count[c]>0){
            center[c][0]/=count[c];
            center[c][1]/=count[c];
            center[c][2]/=count[c];
        }
        }
        
    }//end while(changed)

    System.out.println("cluster, x, y, z");
    for(int i=0; i<data.length; i++){
        System.out.println(cluster[i]+", "+data[i][0]+", "+data[i][1]+", "+data[i][2]);
    }
    System.out.println();
    System.out.println("cluster, center x, center y, center z");
    for(int c=0; c<k; c++){
        System.out.println(c+", "+center[c][0]+", "+center[c][1]+", "+center[c][2]);

    }
    
    
    }//end main()
}//end class
