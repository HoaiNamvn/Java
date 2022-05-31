/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author doanh
 *
 */
import java.lang.Exception;

public class TestException {

    public static void main(String[] args) {
        try {
            TestException.test(-1);

        }catch(NegativeArgumentException nae){
            nae.printStackTrace();
        }
    }

    static void test(int a) throws NegativeArgumentException {
        if (a < 0) {
            throw new NegativeArgumentException("引数が負の値");
        }
        System.out.println("正常の値");
    }
}

class NegativeArgumentException extends Exception {

    NegativeArgumentException(String message) {
        super(message);
    }
}
