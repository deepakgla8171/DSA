package Array;
import java.util.*;
public class CopyArray {
    void arr1(int arr[],int copyarr[]){
     for( int i = 0; i<arr.length; i++){
       copyarr[i] = arr[i];
      System.out.print("CopyArray: "+copyarr[i] + " ");
    }
}
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Size ");
     int n = sc.nextInt();
     System.out.print("Enter Element ");
     int arr[] = new int [n];
     int copyarr[] = new int[n];
     for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
     }
      CopyArray obj  = new CopyArray();
      obj.arr1(arr, copyarr);
        
        
        
    }
}
