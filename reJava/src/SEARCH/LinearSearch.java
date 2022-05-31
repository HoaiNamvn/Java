/*
linearch là cách tìm giá trị bằng cách lần lượt so sánh với các giá trị trong array 
 */
package SEARCH;

/**
 *
 * @author doanh
 */
public class LinearSearch {

    static boolean search(int[] data, int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                System.out.println( "value in "+(i+1) +"th");
                
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args){
        int[] d = {3,2,4,6,1,5,9};
        int k =4;
        if(search(d,k)){
            System.out.println("find ok");
        }else{
            System.out.println("find false");
        }
    }
}

