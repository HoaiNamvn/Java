/*
capsule là một tính chất nói lên khả năng đóng gói của data , ngăn việc sữa biến member ngoài class , biến member của class luôn để pprivate 
 */
package capsule;

/**
 *
 * @author doanh
 */
public class Capsule {

    private int position = 0;// về cơ bản các biến member nên để private 

    public int getPosition() {
        return position;
    }

    public void forWard(int t) {
        position += t;
    }

    public void back(int t) {
        position -= t;
    }
}

class VideoExamle {

    public static void main(String[] args) {
        Capsule p = new Capsule();
        System.out.println(p.getPosition());
        p.forWard(600);
        System.out.println(p.getPosition());
        p.back(100);
        System.out.println(p.getPosition());

    }
}
