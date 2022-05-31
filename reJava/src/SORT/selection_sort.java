/*
selection sort là phương pháp sort mảng mà nó sẽ đem từng vị trí của mảng  đưa ra so sánh với các vị trí còn lại, 
nếu có giá trị nào bé hơn thì tiến hành đổi vị trí, sau đó  chốt ở đầu mảng 
sau đó sẽ cố định vị trí đầu mảng đó (bé nhất ) , và tiếp tục vòng lăp với vị trí tiếp theo 
khi tới vị trị cuối cùng thì sẽ kết thúc  
Lượng tính toán O(n^2)
thuật toán dể hiểu nhưng tốc độ chậm 
 */
package SORT;

/**
 *
 * @author doanh
 */
public class selection_sort {

    public static void sort(int[] d) {
        int i, j, min;
        for (i = 0; i < d.length - 1; i++) {
            min = i; // update min 's value after i loop 
            for (j = i + 1; j < d.length; j++) {
                if (d[min] > d[j]) {
                    min = j;
                }
            }
            int tmp = d[i];
            d[i] = d[min];
            d[min] = tmp;

        }
    }

    static void printData(int[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] data = {11, 8, 12, 10, 15, 7, 5, 9};
        printData(data);
        sort(data);
        printData(data);
    }
}
