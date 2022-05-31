/*
 override là cách tái định nghĩa lại  1 method trong subclass được kế thừa từ 1 supper class  
 */
package override;

/**
 * @author doanh
 */
class Bird {

    public void fly() {
        System.out.println("バタバタ飛んでいます。");
    }
}

class Chicken extends BirdExample {

    public void fly() {
        System.out.println("飛べません");
    }
}

class Eagle {

    public void fly() {
        // no action
    }
}

public class BirdExample {

    public static void main(String[] args) {
        Eagle e = new Eagle();
        Chicken c = new Chicken();
        e.fly();
        c.fly();
    }
}
