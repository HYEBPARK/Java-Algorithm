package D1125;

import java.util.Scanner;

public class Section_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int dp[] = new int[N + 1];
        int arr[] = new int[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = sc.nextInt();
        for (int i = 1; i <= N; i++) dp[i] = dp[i - 1] + arr[i];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= K; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            sb.append(dp[end] - dp[start - 1]).append("\n");
        }
        System.out.println(sb);
    }
}
