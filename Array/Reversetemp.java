package Array;

import java.util.Scanner;

public class Reversetemp {

    void arr1(int arr[]) {

        int temp;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Reversetemp obj = new Reversetemp();
        obj.arr1(arr);
    }
}
