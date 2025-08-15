/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;

/**
 *
 * @author ASUS
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

    System.out.println("Before Sorting:");
    for (int num : arr) {
        System.out.print(num + " ");
    }

    bubbleSort(arr);

    System.out.println("\nAfter Sorting:");
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
    
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

