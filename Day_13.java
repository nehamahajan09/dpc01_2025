import java.util.*;
public class Day_13 {
        public static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }

        public static String longestPalindrome(String s) {
            String longest = "";
            int n = s.length();

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    String sub = s.substring(i, j);
                    if (isPalindrome(sub) && sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
            return longest;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            System.out.println("Longest Palindromic Substring: " + longestPalindrome(input));

            sc.close();
        }
    }

