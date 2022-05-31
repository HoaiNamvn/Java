package SORT;

/**
 *
 * @author doanh
 *
 * loạt serise về thuật toán sắp xếp và tìm kiếm
 */

/*
Bubble sort  là 1 thuật toán cơ bản nhất để sắp xếp 1 chuổi theo thự tự tăng hoặc giảm dần ;
thay đổi vị trị của A[i] A[i+1] , sau mỗi vòng for thì nó chốt lại được 1 số lớn nhát nằm ở cuối dãy 
Lượng tính toán order O(n^2)

ex1: sort array {11, 8, 12, 10, 15, 7, 5, 9}

 */
 /*
b1 tạo hàm sort 
b1 tạo hàm print 
b3 tạo hàm main gọi hàm sort và hàm print đã được định nghĩa 
 */
public class BubbleSort {

    static void sort(int[] d) {
        for (int i = d.length - 1; i > 0; i--) {
            // run j to i value
            for (int j = 0; j < i; j++) {
                
                if (d[j] > d[j + 1]) {
                    int tmp;
                    tmp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = tmp;

                }
            }
        }
    }
    
    static void printData(int[] d){
        for(int i= 0; i<d.length;i++){
            System.out.print(d[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] data = {11, 8, 12, 10, 15, 7, 5, 9};
        printData(data);
        sort(data);
        printData(data);
    }

}
