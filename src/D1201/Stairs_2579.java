package D1201;

import java.util.Scanner;

public class Stairs_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[301];
        int dp[] = new int[301];
        for(int i = 1 ;i<=N; i++) arr[i] = sc.nextInt();
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        dp[3] = Math.max(arr[1],arr[2]) + arr[3];
        for(int i = 4; i<=N; i++){
            dp[i] = Math.max(dp[i-3] + arr[i-1], dp[i-2]) + arr[i];
        }
        System.out.println(dp[N]);

    }
}
