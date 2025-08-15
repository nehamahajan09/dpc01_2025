public class Day_1 {
public static void sortArray(int[] arr){
    int zero=0;
    int one=0;
    int two=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==0)zero++;
        else if(arr[i]==1)one++;
        else if(arr[i]==2)two++;
    }
    for(int i=0;i<zero;i++)arr[i]=0;
    for(int i=zero;i<one+zero;i++)arr[i]=1;
    for(int i=one+zero;i<arr.length;i++)arr[i]=2;
}


    public static void main(String[] args) {
       Day_1 d = new Day_1();
        int[] arr = {2, 0, 2, 1, 1, 0,2,2};

        d.sortArray(arr);

       
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
