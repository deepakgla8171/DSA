package Array;

import java.util.Scanner;

public class Reverse {
   void arr1(int arr[]){
    for(int i = arr.length-1; i>=0; i--){
        System.out.print(arr[i] + " ");

    }
   } 
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size ");
    int n = sc.nextInt();
    System.out.print("Enter Ele ");
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    Reverse obj = new Reverse();
    obj.arr1(arr);
   }
}
