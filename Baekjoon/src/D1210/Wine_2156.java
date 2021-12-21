package D1210;

import java.util.Scanner;

public class Wine_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N + 1];
        int dp[] = new int[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = sc.nextInt();
        dp[0] = 0;
        dp[1] = arr[1];
        for (int i = 2; i < N + 1; i++) {
            if(i==2) dp[2] = Math.max(dp[1], dp[1] + arr[2]);
            else dp[i] = Math.max(Math.max(dp[i-2], arr[i - 1] + dp[i - 3]) + arr[i], dp[i - 1]);
        }
        System.out.println(dp[N]);
    }
}


