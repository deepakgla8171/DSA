package TwoDMatrix;

public class min {
     static void min(int arr1[][]) {
        int min = arr1[0][0];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                if (arr1[i][j] < min) {
                    min = arr1[i][j];
                }
            }
        }

        System.out.println("Manimum = " + min);
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

        min(arr1);
        print(arr1);
    }
}
