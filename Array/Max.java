package Array;
import java.util.*;
public class Max {
    void Maxarray(int arr[]){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
              
               
                max = arr[i];
            }
        }
         System.out.print("Max " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int n = sc.nextInt();
        
        System.out.print("Enter elemnet ");
        int arr[] = new int[n];
      
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Max obj = new Max();
        obj.Maxarray(arr);
        
    }
}
