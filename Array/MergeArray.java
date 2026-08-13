package Array;
import java.util.*;
public class MergeArray {
    void arrays(int arr1[],int arr2[],int merarr[] ){
       int index = 0;
        for(int i = 0; i<arr1.length; i++){
             merarr[index] = arr1[i];
             index++;
        }
         for(int j = 0; j<arr2.length; j++){
           
            index++;
        
         }
        for(int i = 0; i<merarr.length; i++){
            System.out.print(merarr[i] + " ");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size ");
    int n = sc.nextInt();
    System.out.print("First Array1 ");
    int arr1[] = new int[n];
    int arr2[] = new int [n];
    int merarr[] = new int[n+n];
    for(int i = 0; i<n; i++){
        arr1[i] = sc.nextInt();
    }
    System.out.print("Enter 2nd Array ");
  for(int i = 0; i<n; i++){
    arr2[i] = sc.nextInt();
  }
  MergeArray obj = new MergeArray();
  obj.arrays(arr1, arr2,merarr);
    }

}
