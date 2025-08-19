import java.util.*;
public class Day_5 {
     public static List<Integer> findLeaders(int[] arr, int n) {
        LinkedHashSet<Integer> leaders = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                leaders.add(arr[i]);
            }
        }

        return new ArrayList<>(leaders);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        List<Integer> leader = findLeaders(arr, n);

        System.out.println("Leaders: " + leader);
    }
}
