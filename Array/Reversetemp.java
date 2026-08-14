package Array;

import java.util.Scanner;

public class Reversetemp {

    void arr1(int arr[]) {

        int temp=0;
         int j = arr.length - 1;
        for (int i = 0; i < j; i++) {
         temp = arr[i];
         arr[i] = arr[j];
        arr[j] = temp;

    j--;
}
     

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

      
  Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

   

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Reversetemp obj = new Reversetemp();
        obj.arr1(arr);
    }
}
