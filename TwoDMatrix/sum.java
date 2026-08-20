package TwoDMatrix;

public class sum {

    static void sum(int arr1[][]) {
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum = sum + arr1[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }

    static void print(int arr1[][]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr1[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        sum(arr1);
        print(arr1);
    }
}
