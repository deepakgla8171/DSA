package Array;
import java.util.*;
public class UniqueArray3 {
void arr1(int arr[]){
    int ans[] = new int[2];
     int k = 0;
   for(int i = 0; i<arr.length; i++){
    int count = 0;
    for(int j = 0; j<arr.length; j++){
        if(arr[i] == arr[j]){
            count++;
        }
    }
  if(count == 1){
    ans[k] = arr[i];
    k++;
  }
  
}
 System.out.println(ans[0] + " " + arr[1]);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size: ");
    int n = sc.nextInt();
    System.out.print("Enter ele ");
    int arr[] = new int[n];
    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    UniqueArray3 obj = new UniqueArray3();
    obj.arr1(arr);
}
}
