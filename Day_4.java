import java.util.*;
public class Day_4 {

    static void swap(int[] arr1, int k, int[] arr2, int j) {
        int temp = arr1[k];
        arr1[k] = arr2[j];
        arr2[j] = temp;
    }
    public static void mergeArray(int[] arr1,int[] arr2){
         int n=arr1.length;
         int m=arr2.length;
         int i=0,j=0,k=n-1;

         while(i<=k && j<m){
             if(arr1[i]<arr2[j]){
                 i++;
                 continue;
             }else{
                 swap(arr1,k,arr2,j);
                 k--;
                 j++;
             }
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
   
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Arr1 : ");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements for Arr1 : ");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();


        System.out.print("Enter the size of Arr2 : ");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.print("Enter the elements for Arr2 : ");
        for(int i=0;i<n;i++) arr2[i]=sc.nextInt();

        mergeArray(arr1,arr2);

        System.out.println("arr1 = "+Arrays.toString(arr1));
        System.out.println("arr2 = "+Arrays.toString(arr2));


    }
}
