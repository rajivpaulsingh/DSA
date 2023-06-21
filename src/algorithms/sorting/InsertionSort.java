package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 5, 1, 3};

        System.out.println("Sorted array : " + Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {

        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while(j > -1 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}
