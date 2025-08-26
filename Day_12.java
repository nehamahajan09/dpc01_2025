import java.util.Scanner;
import java.util.Stack;
public class Day_12 {
public static boolean isBalanced(String str) {
    Stack<Character> st = new Stack<>();
    int n = str.length();
    for (int i = 0; i < n; i++) {
        char ch = str.charAt(i);
        if (ch == '(' || ch == '{' || ch == '[') {
            st.push(ch);
        }else{
            if(st.size()==0)return false;
            if(st.peek()=='('|| st.peek()=='{'||st.peek()=='[') st.pop();
        }
    }
    if(st.size()>0)
        return false;
    return true;
}  
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
