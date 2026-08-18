package TwoDMatrix;

public class RowSum {
    public static void main(String[] args) {
   
        int arr[][] ={
            {1,2,3},
            {4,5,6}
        };
        for(int i = 0; i<arr.length; i++){
                 int sum = 0;
      
      for(int j = 0; j<arr.length-1; j++){
        sum = sum + arr[i][j];
        System.out.print(sum);
      }

        }
        System.out.println();
    }
}
