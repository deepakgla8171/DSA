package Array;
import java.util.*;
public class Unique1{
  void arr1(int arr[]){
 
    for(int i =0; i<arr.length; i++){
        int count = 0;
        for(int j = 0; j<arr.length; j++){
            if(arr[i]  == arr[j]){
                count++;
            }
        }
            if(count == 1){
 System.out.print("Unique: " +arr[i]);
 break;
    }

    }
   
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size ");
    int n = sc.nextInt();
    System.out.print("Enter Element ");
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    Unique1 obj = new Unique1();
    obj.arr1(arr);
  }
}