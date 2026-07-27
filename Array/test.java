package Array;
import java.util.*;
public class test {
    void arr1(int arr[],int sum){
        int count=0;
   for(int i =0; i<arr.length; i++){
for(int j = 1+1; j<arr.length; j++){
    if(arr[i] + arr[j] == sum){
     count++;
    }
}
   }
   System.out.print(count);
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
        System.out.print("sum ");
        int sum = sc.nextInt();
        test obj = new test();
        obj.arr1(arr, sum);

        
    }
}
