/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;

/**
 *
 * @author ASUS
 */
public class CustomArrayList {
 private int[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create a new CustomArrayList
        CustomArrayList list = new CustomArrayList();

        // Add some numbers
        list.add(10);
        list.add(20);
        list.add(30);

        // Print all elements
        System.out.println("Elements in the list:");
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }

       
    }
    }
    

