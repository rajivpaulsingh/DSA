package datastructures.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2, 5};
        int longest = longestConsecutiveSequence(nums);

        System.out.println(longest);
        /*
            EXPECTED OUTPUT:
            ----------------
            4
            [4, 3, 2, 1, 5]
        */
    }

    private static int longestConsecutiveSequence(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSequence = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }

                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }
}
