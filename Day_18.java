import java.util.*;
public class Day_18 {
        public static int divisor(int n){
            if(n == 1){
                return 1;
            }
            int count=1;
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number :");
            int n=sc.nextInt();
            int ans=divisor(n);
            System.out.println(ans);
        }
    }
