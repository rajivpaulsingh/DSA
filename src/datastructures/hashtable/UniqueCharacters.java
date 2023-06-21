package datastructures.hashtable;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false
        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
        */
    }

    public static boolean hasUniqueChars(String string) {

        Set<Character> set = new HashSet<>();

        for(char c : string.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
            } else {
                return false;
            }
        }
        return true;
    }
}
