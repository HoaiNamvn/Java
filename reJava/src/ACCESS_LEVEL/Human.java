/*
Khi khai báo class thì chỉ được khai báo public hoặc không chỉ định 
Khi khai báo access level cho biến method .. thì có public, private,proted, không chỉ đinh
public :        không hạn chế 
protected :     hạn chế ở trong package , class, lớp kế thừa 
private:        hạn chế trong class 
Không chỉ định: hạn chế trong package và class 

 */
package ACCESS_LEVEL;

/**
 *
 * @author doanh
 */
public class Human {
// dù name và agelà private nhưng nó được gọi bới getName , getAge public  nên sẽ được trả về 

    private String name;
    private int age;
// constractor không có kiểu trả về or void 
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void incrementAge() {// nếu private thì ngăn việc truy cập từ bên ngoài class
        age++;
    }
}

/*
Call Human class
 */

class HumanCaller {

    public static void main(String[] args) {
        Human nam = new Human("nam", 23);
        nam.incrementAge();
        System.out.println(nam.getName() + "は" + nam.getAge() + "才です");
    }

}
