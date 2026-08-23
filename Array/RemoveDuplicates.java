package Array;

public class RemoveDuplicates {
   static int dup(int arr[]){
    int res = 1;
    for(int i = 1; i<arr.length; i++){
        if(arr[i] != arr[res-1]){
            arr[res] = arr[i];
            res++;
        }
    }
    return res;
   }
   public static void main(String[] args) {
    int arr[] ={1,1,0,0,2,3,3,4,4};
   int n = dup(arr);
    for(int i =0; i<n; i++){
       
    }
   } 
}
