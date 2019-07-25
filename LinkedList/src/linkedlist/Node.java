/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

//Node holds the data and the referecnes aka the train car
public class Node {
    //Properties
    Node next;
    int data; 
    
    //Methods!
    
    //Constructors
    public Node(int newData){
        data = newData;
        next = null;
    }
    public Node(int newData ,Node newNext){
        data = newData;
        next = newNext; 
    }

    Node(int newData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Getters
    public int getData(){
        return data;
    }
    
    public Node getNext(){
        return next; 
    } 
   //Setters
   public void setData(int newData){
       data= newData;
   } 
   public void setNext(Node newNode){
       next=newNode; 
   }
   
}
