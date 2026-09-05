package Array;
import java.util.*;
public class ReverseArray {
    void arr1(int arr[],int newarray[]){
        int j =0;
        for(int i =arr.length-1; i>=0; i--){
          newarray[j] = arr[i];
       j++;
        }
        System.out.print("Revers Array: ");
        for(int i = 0; i<newarray.length; i++){
            System.out.print(newarray[i]);
        }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        System.out.print("Enter Element ");
        int arr[] = new int[n];
        int newarray[] = new int[n];
      
        ReverseArray obj = new ReverseArray();
      obj.arr1(arr,newarray);
    }
}
