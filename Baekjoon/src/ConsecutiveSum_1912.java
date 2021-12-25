import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsecutiveSum_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) numArr[i] = Integer.parseInt(st.nextToken());
        dp[0] = numArr[0];
        int max = dp[0];
        for (int i = 1; i < N; i++) {
            if (dp[i - 1] + numArr[i] <= dp[i - 1]) {
                if (dp[i - 1] + numArr[i] < 0) {
                    if (dp[i - 1] < numArr[i]) {
                        dp[i] = numArr[i];
                        if (max < dp[i]) max = dp[i];

                    } else dp[i] = 0;
                } else {
                    dp[i] = dp[i - 1] + numArr[i];
                    if (max < dp[i]) max = dp[i];

                }
            } else {
                dp[i] = dp[i - 1] + numArr[i];
                if (max < dp[i]) max = dp[i];

            }
        }
        System.out.println(max);
    }
}
