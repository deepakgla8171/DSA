package Array;
import java.util.*;
public class SecondLagest {
  
    void arr1(int arr[]){
        int max = arr[0];
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
        max = arr[arr.length-2];
        
        }
         System.out.print(max);
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
         SecondLagest obj = new SecondLagest();
         obj.arr1(arr);
    }
}
