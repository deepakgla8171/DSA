package Array;
import java.util.*;
public class EvenArray {
    void arr1(int arr[]){
       
       for(int i = 0; i<arr.length; i++){
        if(arr[i] % 2 == 0){
           System.out.println("even " +arr[i]); 
        }
         
       }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Size ");
        int n = sc.nextInt();
        System.out.print("Enter Array Ele ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        EvenArray obj = new EvenArray();
        obj.arr1(arr);
    }
}
