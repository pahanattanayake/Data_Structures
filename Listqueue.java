/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;

/**
 *
 * @author ASUS
 */
public class Listqueue {
private Node front, rear;

    private class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) front = rear = newNode;
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) throw new IllegalStateException("Queue is empty.");
        int data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
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

        Listqueue queue = new Listqueue();
    
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); 

        System.out.println("Dequeued: " + queue.dequeue()); 
        queue.display(); 

        queue.enqueue(40);
        queue.display(); 

        System.out.println("Dequeued: " + queue.dequeue()); 
        queue.display(); 
    }
    }
  

