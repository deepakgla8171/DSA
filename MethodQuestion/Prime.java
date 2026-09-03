package MethodQuestion;
public class Prime {

    static boolean prime(int n) {

    

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        boolean ans = prime(13);
        System.out.println(ans);
    }
}