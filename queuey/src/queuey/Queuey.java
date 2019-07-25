
package queuey;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey <D> {
    
    LinkedList <D> queue;
    // Making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }
    // Is our queue empty 
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    //What is the size of our queue?
    public int size(){
        return queue.size();
    }
    // Add to back of linked list
    public void enqueue(D n){
        queue.addLast(n);
    }
    
    public D dequeue(){
        return queue.remove(0);
    }
    
    // Peek at the first item
    public D peek(){
        return queue.get(0);
    }
    
    public static void main(String[] args) {
        
        Stack <String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop() + " ");
        System.out.println(stacky.pop() + "! ");
        
        // TODO code application logic here
//          Queuey stringQueue = new Queuey();
//          stringQueue.enqueue("hi");
//          stringQueue.enqueue("there");
//          System.out.println(stringQueue.dequeue() +" ");
//          System.out.println(stringQueue.dequeue() +".");
          
//        Queuey numberQueue = new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//        System.out.println("First out: "+ numberQueue.dequeue());
//        System.out.println("Second out: "+ numberQueue.dequeue());
//        System.out.println("Third out: "+ numberQueue.dequeue());
        
        
    }
    
}
