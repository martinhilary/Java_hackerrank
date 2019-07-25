/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistgfg;

public class LinkedListGFG {

    //LinkedList Node
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data =d;
            next = null;//constructor
        }
    }
    
    // method to print the linkedlist created
    public void printList(){
        Node n =head;
        while(n != null){
            System.out.println(n.data+ " ");
            n = n.next;
        }
    }
    //method to create a simple linked list with 3 nodes
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListGFG list = new LinkedListGFG();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
       
        
//          list.head        second              third 
//             |                |                  | 
//             |                |                  | 
//         +----+------+     +----+------+     +----+------+ 
//         | 1  | null |     | 2  | null |     |  3 | null | 
//         +----+------+     +----+------+     +----
        
        //We need to link the head to second
        list.head.next = second;
        
        second.next = third;
        
        
        list.printList();
         /*  Now next of second Node refers to third.  So all three 
            nodes are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ */
    }
}


//Why Linked List chosen over Arrays
//1.Dynamic size
//2. Ease of Insertion and Deletion

//Drawbacks
//1.Random Access is not allowed. We have to access elements sequentially from  the first node
//2. Extra memory space for a pointer is required 
//3. Not cache friendly 