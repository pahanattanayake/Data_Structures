/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;

/**
 *
 * @author ASUS
 */
public class ArrayStack {
private int[] arr;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
        
        }
         public void push(int x) {
        if (isFull()) throw new IllegalStateException("Stack overflow");
        arr[++top] = x;
    }
    public int pop() {
        if (isEmpty()) throw new IllegalStateException("Stack underflow");
        return arr[top--];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     ArrayStack stack = new ArrayStack(5);

         
        stack.push(5);
        stack.push(10);
        stack.push(15);
        for (int i = 0; i <= stack.top; i++) { 
            System.out.print(stack.arr[i] + " ");
        }
        System.out.println(); 
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 

        
        stack.push(20);

      
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 

                
    }
    
}

