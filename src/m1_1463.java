import java.io.BufferedReader;
import java.io.InputStreamReader;

public class m1_1463 {
    public static int dp[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        dp = new int[a+1];

        for(int i =2; i<=a; i++){
            dp[i] = dp[i-1]+1;
            if(i%3==0) {
                dp[i]=Math.min(dp[i],dp[i/3]+1);
            }
            if(i%2==0){
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }
        }
        System.out.println(dp[a]);
    }
}
