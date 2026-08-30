package Array;
import java.util.*;
public class TwoSum {
    void arrys(int arr[], int target ){
        for(int i = 0 ; i<arr.length; i++){
         for(int j = i+1; j<arr.length; j++){
            if(arr[i] + arr[j] == target){
       System.out.println("Index Number: " +i + " " + j);
        System.out.print("Element Of Array: " +arr[i] + " " + arr[j]);
            }
      
         } 

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int n = sc.nextInt();
        System.out.print("Enter Array Ele ");
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
        
        }
        System.out.print("Enter Target Number: ");
        int target = sc.nextInt();
        TwoSum obj = new TwoSum();
        obj.arrys(arr, target);
    }
}
