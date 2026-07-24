package Array;
import java.util.Scanner;
public class TargetNumber {
     void arr1(int arr[], int a){
    for(int i = 0; i<arr.length; i++){
        if(arr[i] == a){
            System.out.print(i);
        }
    }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size ");
	    int n = sc.nextInt();
	    
	
	    System.out.print("Enter Elemnet ");
	    int arr[] = new int[n];
	    for(int i = 0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    System.out.print("Target Number ");
	     int a = sc.nextInt();
	  
	    TargetNumber obj = new TargetNumber();
	    obj.arr1(arr,a);
	    
	}
}
