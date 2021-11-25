import java.io.BufferedReader;
import java.io.InputStreamReader;

public class O1_1904 {
    public static int[] dp = new int[1000001];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp[1] =1;
        dp[2] =2;
        for(int i=3; i<1000001; i++){
            dp[i] = (dp[i-1]+dp[i-2]) %15746;
        }
        System.out.println(dp[N]);
    }
}
