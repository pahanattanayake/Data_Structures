/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;
import java.util.Stack;
/**
 *
 * @author ASUS
 */
public class StackQueue {
private Stack<Integer> pushStack = new Stack<>();
    private Stack<Integer> popStack = new Stack<>();

   
    public void enqueue(int x) {
        pushStack.push(x);
    }

    
    public int dequeue() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    
    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        StackQueue queue = new StackQueue();

        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        
        
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 

        
        queue.enqueue(40);

        
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
    }
    }
    

