/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistcollection;

/**
 *
 * @author ASUS
 */
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        fruits.set(1, "Orange");
        System.out.println(fruits);
        fruits.remove("Apple");
        System.out.println(fruits);
    }
}
