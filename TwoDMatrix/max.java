package TwoDMatrix;

public class max {

    static void max(int arr1[][]) {
        int max = arr1[0][0];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                if (arr1[i][j] > max) {
                    max = arr1[i][j];
                }
            }
        }

        System.out.println("Maximum = " + max);
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

        max(arr1);
        print(arr1);
    }
}