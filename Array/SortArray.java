package Array;
import java.util.*;
public class SortArray{
   void arr1(int arr[]){
    int temp = 0;
      for(int i = 0; i<arr.length; i++){
        for(int j = 1+1; j<arr.length; j++){
             
    if(arr[i] > arr[j]){
      temp = arr[i];
      arr[i] = arr[j];
 
    }        
        }
      }
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size ");
    int n = sc.nextInt();
    System.out.print("Enter Array Element ");
    int arr[] = new int[n];
      for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
      } 
      SortArray  obj = new SortArray();
      obj.arr1(arr);
      for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }
   } 
}
