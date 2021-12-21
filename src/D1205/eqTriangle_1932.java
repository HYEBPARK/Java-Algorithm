package D1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class eqTriangle_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N + 1][N + 1];
        int dp[][] = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k = 1; k <= i; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        int max = dp[1][1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + arr[i][j];
                if (max < dp[i][j]) max = dp[i][j];
            }
        }
        System.out.println(max);
    }
}
