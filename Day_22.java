import java.util.*;
public class Day_22 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter " + n + " elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter k: ");
            int k = sc.nextInt();

            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            int ans = -1;
            for (int num : arr) {
                if (freq.get(num) == k) {
                    ans = num;
                    break;
                }
            }

            System.out.println("Result: " + ans);
        }
    }


