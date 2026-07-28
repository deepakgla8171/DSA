package Array;
import java.util.*;
public class SearchElement {
    void arr1(int arr[],int sea){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == sea){
                System.out.print("index " + i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size ");
    int n = sc.nextInt();
    System.out.println("Enter elm ");
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter Search Element ");
    int sea = sc.nextInt();
    SearchElement obj = new SearchElement();
    obj.arr1(arr, sea);

    }
}
