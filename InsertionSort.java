/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanewpackage;

/**
 *
 * @author ASUS
 */
public class InsertionSort {
static void insertionSort(int arr[], int n) {
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr, n);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
