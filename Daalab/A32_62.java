package Daalab;
import java.util.*;
public class sum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
         System.out.print("Enter Element: ");
         int arr[] = new int[n];
         int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}
