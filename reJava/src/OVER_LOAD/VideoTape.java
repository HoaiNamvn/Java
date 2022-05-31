/*
overload là cách định nghĩa các cách tạo nhiều method cùng tên nhhung khác số lượng biến giả 
仮引数 parameter
実引数 argument 
 */
package OVER_LOAD;

/**
 *
 * @author doanh
 */
public class VideoTape {
    private int position;
    public void forward(int t){
        position +=t;
    }
    public void forward(int t, int v){
        position +=v+500+t;
    }
    public void forward(double h){
        position +=(int)h;
    }
}
