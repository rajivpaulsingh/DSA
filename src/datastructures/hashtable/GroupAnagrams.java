package datastructures.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] words1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] words2 = {"abc", "cba", "bac", "foo", "bar"};
        String[] words3 = {"listen", "silent", "triangle", "integral", "garden", "ranged"};

        System.out.println("1st set:");
        System.out.println(groupAnagrams(words1));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(words2));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(words3));
    }

    private static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : words) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);

            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
