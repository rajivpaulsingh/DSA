package datastructures.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

    }

    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i : arr) {
            if(!set.contains(i)) {
                set.add(i);
            } else {
                list.add(i);
            }
        }
        return list;
    }

}
