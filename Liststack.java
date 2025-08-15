/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;

/**
 *
 * @author ASUS
 */
public class Liststack {
private Node top;

    
    private class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    
    public int pop() {
        if (top == null) throw new IllegalStateException("Stack empty");
        int data = top.data;
        top = top.next;
        return data;
    }

    
    public void display() {
        Node temp = top;
        System.out.print("Stack (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Liststack stack = new Liststack();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

       
        stack.display(); 

        
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop());

        
        stack.display(); 

        
        stack.push(40);
        stack.display(); 
    }
    }
    

