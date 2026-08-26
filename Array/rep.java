package Array;
import java.util.*;
public class rep {
    void arr1(int arr[]){
      for(int i = 0; i<arr.length; i++){
      
        for(int j = 0; j<arr.length; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count > 1){
         System.out.print(arr[i]); 
         return;
        }
      
      }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int n = sc.nextInt();
        System.out.print("Enter Array Ele ");
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
      rep obj = new rep();
      obj.arr1(arr);
       
}
}