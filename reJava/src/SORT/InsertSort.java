/*
InsertSort là phương pháp chèn 1 giá trị vào 1 mảng đã sắp xếp trước
chạy từ sau tới trước và so sánh xem nó có lớn hơn giá trị nào không nếu lớn hơn thì sẽ dừng lại ngay sau vị trị đó 
O(n^2)
 */
package SORT;

/**
 *
 * @author doanh
 */
public class InsertSort {

    static void sort(int[] d) {
        int i, j;
        for (i = 1; i < d.length; i++) {
            int tmp = d[i]; // di bỏ tạm 
            for (j = i - 1; j >= 0; j--) {
                if (d[j] <= tmp) {
                    break;
                }
                d[j + 1] = d[j];
            }
            d[j + 1] = tmp;

        }
    }

    static void printData(int[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] data = {10, 8, 15, 21, 5};
        int a = 9;
        printData(data);
        sort(data);
        printData(data);
    }
}
