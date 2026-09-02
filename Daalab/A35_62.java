package Daalab;
import java.util.*;
public class twoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
         System.out.print("Enter Element Array1: ");
         int arr1[] = new int[n];
         
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
         }
        System.out.print("Enter Element Array2: ");
         int arr2[] = new int[n];
           for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
         }
         int carry = 0;

        for(int i = arr1.length - 1; i >= 0; i--) {
        int sum = arr1[i] + arr2[i] + carry;
        System.out.println(sum % 10);
       carry = sum / 10;
}

   if(carry > 0)
    System.out.print( "ans "+carry);
    }
}
