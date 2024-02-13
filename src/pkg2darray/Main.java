/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] Hello1D = {55, 5, 5, 1, 3};
//        int[][] Hello2D = {
//            /*0*/ {1,2,3},
//            /*1*/ {4,5,6},
//            /*2*/ {7,8,9},
//       };
//       int xRow = 2;
//         int yColumn =2;
        
//        System.out.println("Your Array is: " + Hello2D[xRow][yColumn]);
        
//       int[] Numericarray = {120,150,2,55,1000,10002,5};
 //       String[] Stringarray = {"Peter","James","John","Joseph"};
                                
                               
        
 //       System.out.println("Your Original Array " + Arrays.toString(Numericarray)+ "\n " + Arrays.toString(Stringarray));
        
 //       Arrays.sort(Numericarray);
 //       Arrays.sort(Stringarray);
        
//      System.out.println("Your Sorted Array " + Arrays.toString(Numericarray) + "\n" + Arrays.toString(Stringarray));
        
        String[] stringstringArray = new String[] {"Peter", "James", "John"};
        ArrayList arrayList = new ArrayList(Arrays.asList(stringstringArray));
        
        System.out.println( "Your Array Is: " + arrayList );
    }
    
}