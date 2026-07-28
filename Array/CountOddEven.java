package Array;
import java.util.*;
public class CountOddEven {
    void arr1(int arr[]){
        int Evencount = 0;
        int Oddcount= 0;
        for(int i = 0; i<arr.length; i++){
            if( arr[i] % 2 == 0){
                     Evencount++;
                } 
                if(arr[i] % 2 == 1){
                    Oddcount++;
                }
             }

            System.out.println("Even Number "+ Evencount);
             System.out.print("Odd Number "+ Oddcount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int n = sc.nextInt();
        System.out.print("Enter ele ");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
      CountOddEven obj = new CountOddEven();
      obj.arr1(arr);
        
    }
   
}
