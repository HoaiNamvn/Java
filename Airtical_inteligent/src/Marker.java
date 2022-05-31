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
* 画像中のマーカーを認識するプログラム
*/
public class Marker{
    public static void main(String[] args){
    
        int[][] image={{1,2,5,7,2,1},
                       {7,9,0,5,4,3},
                       {0,3,2,9,9,9},
                       {1,9,0,9,0,9},
                       {3,1,2,9,9,9},
                       {4,6,4,7,0,2}};
                
        int[][] marker={{9,9,9},
                        {9,0,9},
                        {9,9,9}};
        

        //画像表示
        System.out.println("画像");
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----");

        //マーカー表示
        System.out.println("マーカー");
        for(int i=0; i<marker.length; i++){
            for(int j=0; j<marker[i].length; j++){
                System.out.print(marker[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----");

        //マーカー検索
        int markerposx=-1;
        int markerposy=-1;
        out:
        for(int i=0; i<=(image.length-marker.length); i++){
            next:
            for(int j=0; j<=(image[i].length-marker[0].length); j++){
                for(int k=0; k<marker.length; k++){
                    for(int l=0; l<marker[k].length; l++){
                        if( image[i+k][j+l] != marker[k][l] ){//一致せず
                            continue next;
                        }
                    }
                }
                //マーカー発見
                markerposx=j;
                markerposy=i;
                System.out.println("マーカー発見");
                break out;
            }
        }

        System.out.println("マーカー座標x:"+markerposx+" y:"+markerposy);
        //画像表示
        System.out.println("画像");
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                if(i>=markerposy && i<markerposy+marker.length &&
                   j>=markerposx && j<markerposx+marker[0].length){
                    System.out.print("*");
                }else{
                    System.out.print(image[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("-----");
    }
}
