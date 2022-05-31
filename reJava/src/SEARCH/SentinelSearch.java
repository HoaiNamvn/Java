/*
番兵法 lính gác :
bình thường phải chạy qua hai điều kiện là i có < data.length và key== data[i] , thì bây giờ chỉ cần xét xem 
 */
package SEARCH;

/**
 *
 * @author doanh
 */
public class SentinelSearch {

    static boolean search(int[] data, int key) {
        data[data.length - 1] = key; // tạo giá trị cho lính canh 
        int i;
        for (i = 0; data[i] != key; i++) {
        }
        return i < data.length - 1;
    }

    public static void main(String[] args) {
        int[] d = {3, 4, 5, 1, 2, 6, 7, 8, 0}; // bỏ lính canh ở sau cùng 
        if (search(d, 4)) {
            System.out.println("find access");
        } else {
            System.out.println("find not access");

        }

    }
}
