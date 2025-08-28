import java.util.*;
public class Day_14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter string: ");
            String s = sc.nextLine();

            System.out.print("Enter value of k: ");
            int k = sc.nextInt();

            int n = s.length();
            int count = 0;
            for (int i = 0; i < n; i++) {
                Set<Character> set = new HashSet<>();
                for (int j = i; j < n; j++) {
                    set.add(s.charAt(j));
                    if (set.size() == k) {
                        count++;
                    } else if (set.size() > k) {
                        break;
                    }
                }
            }

            System.out.println(count);
        }
    }
