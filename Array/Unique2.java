package Array;
import java.util.*;
public class Unique2 {
    void arr(int arr[]){
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
        ans = ans ^ arr[i];
        }
        System.out.print("Unique: " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter Size ");
      int n = sc.nextInt();
      System.out.print("Enter Element ");
      int arr[] = new int[n];
    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    Unique2 obj = new Unique2();
    obj.arr(arr);
    }
}
