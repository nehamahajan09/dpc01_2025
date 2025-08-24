import java.util.*;
public class Day_10 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input in one line
            System.out.println("Enter words separated by space:");
            String[] strs = sc.nextLine().split(" ");

            // Map for grouping anagrams
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] arr = word.toCharArray();
                Arrays.sort(arr); // sort word
                String key = new String(arr);

                map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }

            // Print result
            System.out.println("Grouped Anagrams:");
            for (List<String> group : map.values()) {
                System.out.println(group);
            }
        }
    }
