import java.util.*;
public class Day_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String sentence=sc.nextLine();

        String[] words=sentence.split(" ");

        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }

    }
}
