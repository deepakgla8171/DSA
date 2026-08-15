package Array;
import java.util.*;;
public class SwapFristLast {
void arr1(int arr[]){
 
  int temp = 0;
   
    temp = arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length-1] = temp;
   
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size ");
   
    System.out.print("Enter Array Ele ");
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    SwapFristLast obj = new SwapFristLast();
    obj .arr1(arr);
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
}
}
