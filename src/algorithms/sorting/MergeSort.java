package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 5, 1, 3};

        System.out.println("Sorted array : " + Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {

        int n = arr.length;
        int midIndex = n / 2;

        if(n == 1) return arr; // base case

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr, midIndex, n));

        return merge(left, right);
    }

    private static int[] merge(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
                k++;
            } else {
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < m) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }
}
