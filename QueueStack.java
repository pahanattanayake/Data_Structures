/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author ASUS
 */
public class QueueStack {
private Queue<Integer> mainQueue = new LinkedList<>();
    private Queue<Integer> auxQueue = new LinkedList<>();

    
    public void push(int x) {
        auxQueue.add(x);
        while (!mainQueue.isEmpty()) {
            auxQueue.add(mainQueue.remove());
        }
        Queue<Integer> temp = mainQueue;
        mainQueue = auxQueue;
        auxQueue = temp;
    }

    
    public int pop() {
        if (mainQueue.isEmpty()) throw new IllegalStateException("Stack empty");
        return mainQueue.remove();
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueStack stack = new QueueStack();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 

        
        stack.push(40);

        
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 
    }
    }
    

