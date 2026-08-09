package Array;

import java.util.Scanner;

public class duplicate {
    void arr1(int arr[]){
        int du=0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
           if(arr[i] == arr[j]){
            System.out.print(du);
           
           }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int n = sc.nextInt();
        System.out.print("Enter Array ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
         duplicate obj = new duplicate();
         obj.arr1(arr);

    }
}
