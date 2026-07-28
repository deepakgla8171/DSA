package Array;
import java.util.*;;
public class SumAverage {
    void arr1(int arr[]){
    int sum = 0;
    double avg;
    for(int i = 0; i<arr.length; i++){
        sum = sum + arr[i];
    }
    System.out.println(sum);
    avg = sum/2;
    System.out.print(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size ");
        int n = sc.nextInt();
        System.out.print("Enter Ele " );
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        SumAverage obj = new SumAverage();
        obj.arr1(arr);
    }
}
