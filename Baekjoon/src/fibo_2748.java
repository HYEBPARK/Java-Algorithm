package D0114;

import java.util.Scanner;

public class fibo_2748 {
    static long dp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n+1];
        dp[1] = 1;
        System.out.println(fibo(n));
    }

    private static long fibo(int n) {
        if(n == 1) return 1;
        if(dp[n-1] != 0) {
            dp[n] = dp[n-1] + dp[n-2];
            return dp[n];
        }
        return fibo(n-1) + fibo(n-2);
    }
}
