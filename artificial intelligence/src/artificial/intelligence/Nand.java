package artificial.intelligence;
import java.io.*;

/**
   @author doanh
   学籍番号 j19317
   氏名 ドアン　ホアイ　ナム
   日付　2021/12/16
 */
public class Nand {
    public static void main(String[] args) throws IOException {
    // 変数の初期化    
    int weight_x = 0;   // 重み x
    int weight_y = 0;   //重み y
    int thresold = 0;  // 閾値
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("NAND の制御プログラミンング");
        System.out.println("入力 x を0 か 1を入力してください。");
        String input_text_x = buf.readLine(); 
        // int 型に変換
        int input_x =Integer.parseInt(input_text_x);
        System.out.println("入力 y を0 か 1を入力してください。");
        String input_text_y = buf.readLine(); 
        // int 型に変換
        int input_y =Integer.parseInt(input_text_y);
        weight_x = 1;
        weight_y = 1;
        thresold = 2;
        if(((input_x * weight_x) + (input_y * weight_y)) >= thresold){
            System.out.println("出力は　0　です");
        }else{
            System.out.println("出力は　1　です");
        }
    }
}
