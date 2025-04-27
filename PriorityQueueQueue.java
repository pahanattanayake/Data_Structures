/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistcollection;

/**
 *
 * @author ASUS
 */

    import java.util.PriorityQueue;

public class PriorityQueueQueue {

public static void main(String[] args) {

PriorityQueue<Integer> queue = new PriorityQueue<>();

queue.add(10);
queue.add(20);
queue.add(15);

System.out.println(queue);


int size = queue.size();
for(int i=0; i<size; i++)
    System.out.println(queue.poll());
}

}



