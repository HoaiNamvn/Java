/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capsule;

/**
 *
 * @author doanh
 */
public class Dog {
    public String name;
    public static int number = 0;
    Dog(String name){
        this.name= name;
        number++;
    }
}
class DogExample{
public static void main(String[] args){
Dog pochi = new Dog("pochi");
Dog shiro = new Dog("shiro");
System.out.println("犬の数＝"+Dog.number);// 2 vì nó đã thay đổi giá trị duy nhất static 
System.out.println("犬の数＝"+shiro.number);//2

}
}