package Array;

public class EvenOddMove {
    static void move(int arr[]){
        int n = arr.length;
        int left =0;
        int right= n-1;
        while (left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2== 0){
            swap(arr, left, right);
            left++;
            right--;
        }
          if(arr[left] %2 == 0){
            left++;
          }  
          if(arr[right] % 2 == 1){
            right--;
          }
        }
    }
    static void swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void sort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,8,4,1,2,6};
        System.out.println("Origranal Array: ");
        printArray(arr);

        move(arr);
       System.out.println("Even First Ans Odd Second: ");
         sort(arr);
       printArray(arr);
     
    }
}
