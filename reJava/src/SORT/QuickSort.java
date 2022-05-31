/*
# O(nlog(n)) quickSort
chia đôi data , rồi tiếp tục chia đôi data tới mức  nhỏ nhất ..
đổi vị trí trái phải pivot 
= sellSort(chia theo khoảng cách rồi đổi chổ )  = heep Sort (chia cành cây 2 nhánh , bỏ các value vào theo thứ tự và so sánh, xong lấy số lớn nhất đặt ở cuối cùng . sau đó lấy điểm cuối đặt lên đầu  )

# O(n)  baketSort(bin) chuẩn bị bấy nhiêu bộ nhớ + 1 để lưu ,dù data có nhiều tới đâu thì nó chỉ việc tăng lên bấy nhiêu lần nạp thôi nên tính năng đươc đảm bảo :
                   phải chuẩn bị bộ nhớ 
                
# O(n) 基礎ソート　

https://www.youtube.com/watch?v=nfklhZbfSNA

O là order lượng tính toán , được lược bớt những giá trị ít bị ảnh hưởng 
O(1)  < log(n)  <  n  <  n*log(n)  <  n^2  <  n^2*log(n)
 */
package SORT;

/**
 *
 * @author doanh
 */
public class QuickSort {

    static void quickSort(int[] d, int left, int right) {
//         d[lef]->d[right] sort đoạn giữa này 
        if (left >= right) { // ok return true 
            return;
        }
        int pivot = d[(left + right) / 2];
        int l = left, r = right, work;
        while (true) {
            while (d[l] < pivot) {
                l++;
            }
            while (d[r] > pivot) {
                r--;
            }
            if (l > r) {
                break;
            }
            work = d[l];
            d[l] = d[r];
            d[r] = work;
            l++;
            r--;
        }
        quickSort(d, left, r);
        quickSort(d, l, right);
    }

    static void printData(int[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {11, 8, 12, 10, 15, 7, 5, 9};
        printData(data);
        quickSort(data, 0, data.length - 1);
        printData(data);

    }
}
