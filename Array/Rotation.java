package Array;

public class Rotation {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr,0, n - 1);
    }
    static void printArray(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
     System.out.print("Ori Array: ");
        printArray(arr);
          rotate(arr, k);
       System.out.print("Rotated Array: ");
        printArray(arr);
    }
}

