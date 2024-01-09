import java.util.HashMap;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create two hashmaps to store the frequencies of characters in each string
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Iterate over the characters of the first string and store their frequency in map1
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // Iterate over the characters of the second string and store their frequency in map2
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Compare the two hashmaps
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dabc";

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams of each other");
        } else {
            System.out.println("The two strings are not anagrams of each other");
        }
    }
}
