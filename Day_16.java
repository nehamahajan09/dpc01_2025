import java.util.*;
public class Day_16 {
        // Function to find GCD using Euclidean algorithm
        public static long gcd(long a, long b) {
            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // Function to find LCM
        public static long lcm(long a, long b) {
            return (a / gcd(a, b)) * b;  // To avoid overflow
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number (N): ");
            long N = sc.nextLong();

            System.out.print("Enter second number (M): ");
            long M = sc.nextLong();

            long result = lcm(N, M);

            System.out.println("LCM of " + N + " and " + M + " is: " + result);

           
        }
    }

