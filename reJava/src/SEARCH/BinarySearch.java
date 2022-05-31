/*
data phải được sort sẳn 
so sánh vơi giá trị trung tâm 
 */
package SEARCH;

/**
 *
 * @author doanh
 */
public class BinarySearch {

    static boolean search(int[] data, int key, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = (left + right) / 2;
        if (data[mid] == key) {
            return true;
        }
        if (data[mid] > key) {
            return search(data, key, left, mid - 1);
        } else {
            return search(data, key, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 6, 8, 9, 10};
        if (search(data, 10, 0, data.length - 1)) {
            System.out.println("find access");
        } else {
            System.out.println("find not access");
        }
    }
}
