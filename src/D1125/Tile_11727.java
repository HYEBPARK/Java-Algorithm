package D1125;

import java.util.Scanner;

public class Tile_11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            if(i%2==0) dp[i] = (dp[i-1]+dp[i-1]+1) % 10007;
            else dp[i] = (dp[i-1]+dp[i-1]-1) % 10007;
        }
        System.out.println(dp[n]);
    }
}
