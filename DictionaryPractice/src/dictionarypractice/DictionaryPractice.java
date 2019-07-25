/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        // TODO code application logic here
        // English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap <String, String>();
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        //Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        //Print out all keys        
        System.out.println(englSpanDictionary.keySet());
        //Print out all values
        System.out.println(englSpanDictionary.values());
        //Print out size
        System.out.println("The size of our dictionary is "+ englSpanDictionary.size());
        System.out.println();
        System.out.println();
        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap <String, Boolean> ();
//        Put the shopping list items in he dictionary
        shoppingList.put("Ham",Boolean.TRUE);
        shoppingList.put("Bread",Boolean.TRUE);
        shoppingList.put("Oreos",Boolean.TRUE);
        shoppingList.put("Eggs",Boolean.FALSE);
        shoppingList.put("Sugar",Boolean.FALSE);
//       Retrieve Items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());

//      Clear the dictionary
//        shoppingList.clear();
        shoppingList.remove("Eggs");
        shoppingList.replace("Sugar", Boolean.TRUE);
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());

    }
    
}


//Phonebook Practice tutorial
////Complete this code or write your own from scratch
//import java.util.*;
//import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
//class Solution{
//    public static void main(String []arg){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        // Formation of dictionary
//        Map <String, Integer> phoneBook = new HashMap <String, Integer>();
//        for(int i = 0; i < n; i++){
//            String name = in.next();
//            int phone = in.nextInt();
//            // Write code here
//            phoneBook.put(name,phone);
//        }
//        System.out.println(phoneBook);
//        // Query code
//        // While there is input from user
//        while(in.hasNext()){
//            String s = in.next();
//            // Write code here
//            System.out.println(s);
//            // if s in phonebook then print key value pair
//            
//            // if(phoneBook.containsKey("sam")){
//            Set keys = phoneBook.keySet();
//            System.out.print(keys);
//            //     System.out.print(phoneBook.getKey() + "=" + phoneBook.getValue());
//            // }
//            // System.out.println(phoneBook.containsKey("sam"));
//        }
//        in.close();
//    }
//}
//
