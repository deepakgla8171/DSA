package Daalab;
import java.util.*;
public class A33_62 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Size: ");
        int n = sc.nextInt();
   
        int arr2[] = new int[n];
        int arr3[] = new int[n];
         System.out.print("Enter Element Array1: ");
        for(int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
       System.out.print("Enter Element Array2: ");
        for(int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();
       for(int i = 0; i < n; i++)
            arr3[i] = arr1[i] + arr2[i];

        System.out.print("{");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if(i < n - 1)
                System.out.print(", ");
        }
        System.out.println("}");
    }
}