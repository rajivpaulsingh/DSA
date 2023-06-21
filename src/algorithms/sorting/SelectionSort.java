package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 5, 1, 3};

        System.out.println("Sorted array : " + Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int minIndex = i;
            for(int j = i + 1; j < n; j++) {

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
