/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rejava;

/**
 *
 * @author doanh
 */
public class ReJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = {8, 3, 10, 21, 4, -1, 30};

        for (int i = 0; i < myArray.length/2; i++) {
            int tmp;
            tmp = myArray[i];
            myArray[i] = myArray[myArray.length - 1-i];
            myArray[myArray.length - 1-i] = tmp;
        }
        
        for(int i = 0; i<myArray.length;i++){
               System.out.println(myArray[i]);
        }
     
    }

}
