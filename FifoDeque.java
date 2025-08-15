/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author ASUS
 */
public class FifoDeque<E> {
private final Deque<E> deque = new ArrayDeque<>();

    public void enqueue(E element) {
        deque.addLast(element);
    }

    public E dequeue() {
        return deque.removeFirst();
    }

    public E peek() {
        return deque.peekFirst();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
       FifoDeque<Integer> queue = new FifoDeque<>();

        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        
        System.out.println("Front element: " + queue.peek()); 

        
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 

       
        queue.enqueue(40);

       
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 

        
        System.out.println("Queue empty? " + queue.isEmpty()); 
    }
    }
   

