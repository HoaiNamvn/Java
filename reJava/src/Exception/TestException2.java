/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author doanh
 */
public class TestException2 {

    public static void main(String[] args) throws NegativeArgumentException {
        TestException2.test(-1);
    }

    static void test(int a) throws NegativeArgumentException {
        if (a < 0) {
            throw new NegativeArgumentException("引数が負の値である。");
        }
        System.out.println("正常の値です。");
    }
}

class NegativeArgumentException extends Exception {
    NegativeArgumentException(String message) {
        super(mesage);
    }
}
