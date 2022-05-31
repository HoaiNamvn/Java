/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA_Structure;

/**
 *
 * @author doanh
 */
public class Node {

    public int data;
    public Node next;
}

class linkedList {

    public static void main(String[] args) {
        Node n1 = new Node();
        n1.data = 100;
        Node n2 = new Node();
        n1.data = 200;
        Node n3 = new Node();
        n2.data = 300;
        n1.next = n2;
        n2.next = n3;
    }
}
