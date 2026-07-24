package Array;
import java.util.*;
public class Min {
    void arr1(int arr[]){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("Min " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int n = sc.nextInt();
        System.out.print("Enter ele ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Min obj = new Min();
        obj.arr1(arr);
    }
}
