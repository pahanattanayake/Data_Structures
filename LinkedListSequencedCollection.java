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
import java.util.SequencedCollection;

public class LinkedListSequencedCollection {
    public LinkedListSequencedCollection(){
        SequencedCollection sc= new LinkedList();
        sc.addFirst(5);
        sc.addFirst(2);
        sc.addLast(3);
        
        System.out.println(sc.getFirst());
         System.out.println(sc.removeLast());
         System.out.println(sc);
         System.out.println(sc.reversed());
        
      
    }
    public static void main(String[]args){
        new LinkedListSequencedCollection();
    }
}
