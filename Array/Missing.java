package Array;
import java.util.*;;
public class Missing {
    void arr1(int arr[],int n){
        int sum = 0;
        int total = 0;
      for(int i = 0; i<arr.length; i++){
   sum = sum+arr[i];

      }
       int miss = n*(n+1)/2;
      total = sum - miss;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter Size ");
        int n = sc.nextInt();
         System.out.print("Enter ele ");
         int arr[] = new int[n];
         for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
         }
       
         Missing obj = new Missing();
         obj.arr1(arr,n);
}
}
