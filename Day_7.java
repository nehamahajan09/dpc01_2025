import java.util.*;
public class Day_7 {
        public static int trap(int[] height) {
            int left = 0, right = height.length - 1;
            int leftMax = 0, rightMax = 0, water = 0;

            while (left < right) {
                if (height[left] < height[right]) {
                    if (height[left] >= leftMax) {
                        leftMax = height[left];
                    } else {
                        water += leftMax - height[left];
                    }
                    left++;
                } else {
                    if (height[right] >= rightMax) {
                        rightMax = height[right];
                    } else {
                        water += rightMax - height[right];
                    }
                    right--;
                }
            }
            return water;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] height = new int[n];

            System.out.println("Enter the elements of height array:");
            for (int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }
            System.out.println("Trapped Water: " + trap(height));

        }
    }

