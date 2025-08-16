import java.util.*;

public class Day_2 {
    public static int findMissing(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter numbers (comma separated): ");
        String[] numbers = sc.nextLine().split(",");

        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i].trim());
        }

        System.out.println("Missing Number is " + findMissing(arr, n));
    }
}

