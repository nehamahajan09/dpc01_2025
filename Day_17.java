import java.util.*;
public class Day_17 {
        public static List<Integer> primeFactors(int n) {
            List<Integer> factors = new ArrayList<>();
            // Divide by 2 until n is odd
            while (n % 2 == 0) {
                factors.add(2);
                n /= 2;
            }
            // Try odd factors from 3 up to sqrt(n)
            for (int i = 3; i * i <= n; i += 2) {
                while (n % i == 0) {
                    factors.add(i);
                    n /= i;
                }
            }
            // If n is still > 2, then n is prime
            if (n > 2) {
                factors.add(n);
            }

            return factors;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int n = sc.nextInt();

            List<Integer> result = primeFactors(n);
            System.out.println("Prime factors of " + n + " are: " + result);
        }
    }
