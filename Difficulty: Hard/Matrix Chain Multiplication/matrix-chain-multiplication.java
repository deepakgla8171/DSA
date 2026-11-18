
class Solution {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j < n; j++) {

                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int ans = dp[i][k] + dp[k+1][j]
                            + arr[i-1] * arr[k] * arr[j];

                    if (ans < dp[i][j]) {
                        dp[i][j] = ans;
                    }
                }
            }
        }

        return dp[1][n-1];
    }
}
