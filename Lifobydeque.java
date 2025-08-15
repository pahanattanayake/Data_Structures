/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;
import java.util.Deque;
import java.util.ArrayDeque;
/**
 *
 * @author ASUS
 */
public class Lifobydeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LIFOQueue<Integer> lifoQueue = new LIFOQueue<>();  
        lifoQueue.push(10);
        lifoQueue.push(20);
        lifoQueue.push(30);

        System.out.println("Top: " + lifoQueue.peek());
        System.out.println("Popped: " + lifoQueue.pop()); 
        System.out.println("Top after pop: " + lifoQueue.peek());
    }
}
   class LIFOQueue<E> {
    private final Deque<E> deque = new ArrayDeque<>();

    public void push(E element) {
        deque.addFirst(element);
    }

    public E pop() {
        return deque.removeFirst();
    }

    public E peek() {
        return deque.peekFirst();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }
}

