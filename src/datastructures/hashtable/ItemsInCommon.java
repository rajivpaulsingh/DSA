package datastructures.hashtable;

import java.util.HashMap;

public class ItemsInCommon {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon1(array1, array2));
        System.out.println(itemInCommon2(array1, array2));
    }

    private static boolean itemInCommon1(int[] arr1, int[] arr2) {

        for(int i : arr1) {
            for(int j : arr2) {
                if(i == j) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean itemInCommon2(int[] arr1, int[] arr2) {

        HashMap<Integer, Boolean> hmap = new HashMap<>();
        for(int i : arr1) {
            hmap.put(i, true);
        }
        for(int j : arr2) {
            if(hmap.get(j) != null) {
                return true;
            }
        }
        return false;
    }
}
