/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;
import java.io.*; 
import java.lang.reflect.Array;
import java.util.*; 
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
//    create function
    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.println(element + " ");
        }  
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Initialize an array
//        int[] intArray1; 
//        int[] intArray2 = new int[4];
//        int[] intArray3 ={5,2,9,3,1};
//        
        
        
        // Declaring, Allocating and Initialization
        Integer [] intArray1;
        Integer [] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer [] intArray3 = {5,2,9,1,3};
        
        String[] shoppingList= {"bananas","apples","pears"};
        
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        //Custom print out arrays        
//        printArray(intArray2);
//        printArray(intArray3);
        System.out.println();
        //Retreive objects
        System.out.println(intArray2[3]);
        System.out.println( Array.get(intArray2,2));
        System.out.println();
        //Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        printArray(shoppingList);
        System.out.println("Special For Loop");
        // For Loops
        for( String s : shoppingList){
            System.out.println(s);
        }
    }
    
}
