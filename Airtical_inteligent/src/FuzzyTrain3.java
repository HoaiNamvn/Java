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
*  ファジィ制御による電車の自動制御プログラム
*  ゴール手前100m地点で25m/sの速度から始め、ゴールにぴったりと止める。
*/
public class FuzzyTrain3 {

    public static void main(String[] args){
        double INITX=-1000; //ゴール手前 mからスタート
        double INITSPEED=25;//初期速度 m/s (25m/s = 90km/h)
        double INITACCEL=0;//初期加速 m/s^2
        int LOOP=20000;//無限ループ防止のための最大秒数

        double x=INITX; //現在距離
        double speed=INITSPEED;//現在速度
        double accel=INITACCEL;//現在加速

        System.out.println("sec ; x; speed; accel"); //出力用ラベル
        System.out.printf("0, %.5f, %.5f, %.5f\n",x,speed,accel); //初期状態表示
        //System.out.println("0,"+x+","+speed+","+accel); //初期状態表示
        
        for(int i=1; i<LOOP; i++){
            //Rule1 IF 駅が遠い AND 速度が高い -> 減速(out1)
            //Rule2 IF 駅が近い AND 速度が高い -> 多く減速(out2)
            //Rule3 IF 駅が近い AND 速度が低い -> 弱く減速(out3)

            //各ファジィルールの前件部ファジィ値を計算
            double rule1 = AND(fuzzySetR(x/INITX),fuzzySetR(speed/INITSPEED));
            double rule2 = AND(fuzzySetL(x/INITX),fuzzySetR(speed/INITSPEED));
            double rule3 = AND(fuzzySetL(x/INITX),fuzzySetL(speed/INITSPEED));

            //ファジィルールのシングルトン後件部を計算
            double out1 = -0.3;  //Rule1後件部 減速(out1)
            double out2 = -0.4; //Rule3後件部 多く減速(out2)
            double out3 = -0.2333;  //Rule4後件部 弱く減速(out3)

            //簡略化推論法による重心計算(平均を取る)
            accel = ((rule1*out1) + (rule2*out2) + (rule3*out3)) / (rule1 + rule2 + rule3);

            speed=speed+accel; //現在の速度に加速を加算
            x=x+speed;  //現在の位置に速度を加算

            System.out.printf("%d, %.5f, %.5f, %.5f\n",i,x,speed,accel); //現在位置を表示

            if(speed<0.01) break; //列車が止まったら終了
        }
    }


    //ファジィメンバシップ関数(左肩上がり右肩下がり)
    static double fuzzySetL(double value){ // 近い、遅い:0を頂点の坂
        double grade=0.0;
        if(value<=0.0){
            grade=1.0;
        }else if(value>=1.0){
            grade=0.0;
        }else {
            grade=(value*-1.0)+1.0;
        }
        return grade;
    }

    //ファジィメンバシップ関数(左肩下がり右肩上がり)
    static double fuzzySetR(double value){ // 遠い、早い:1.0を頂点の坂
        double grade=0.0;
        if(value>=1.0){
            grade=1.0;
        }else if(value<=0.0){
            grade=0.0;
        }else {
            grade=value;
        }
        return grade;
    }

    //ファジィ論理積(AND)
    static double AND(double a, double b){
        double and;
        if(a < b){
            and = a;
        }else{
            and = b;
        }
        return and;
    }

} //end class
