package Daalab;
import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
         System.out.print("Enter Element: ");
         int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int largest = arr[0];
        int second = arr[0];

         for(int i = 1; i < arr.length; i++) {
           if(arr[i] > largest) {
           second = largest;
           largest = arr[i];
    }
          else if(arr[i] > second && arr[i] != largest) {
            second = arr[i];
    }
}

       System.out.println("Second Largest = " + second);
    }
}
