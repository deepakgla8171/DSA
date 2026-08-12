package Array;
public class MoveZero {
    static void move(int arr[]){
      int n = arr.length;
     int left = 0;
       int right = n-1;
       while(left < right){
        if(arr[left] == 1 && arr[right] == 0){
        swap(arr, left, right);
        left++;
        right--;
        }
        if(arr[left] == 0){
            left++;
        }
        if(arr[right] == 1){
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
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,0};
        System.out.println("Origanal Array");
        printArray(arr);
        move(arr);
        System.out.println("Move Array");
       
    }
   
}
