import java.util.Scanner;
import java.util.Stack;

public class Day_20 {
    static void insert(Stack<Integer> st, int x) {
        if (st.isEmpty() || x > st.peek()) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);
    }
    static void sort(Stack<Integer> st){
        if (!st.isEmpty()) {
            int x = st.pop();
            sort(st);
            insert(st, x);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.print("Enter Size : ");
        int n=sc.nextInt();

        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        sort(st);
        System.out.print("Sorted Satck "+st);
    }
}
