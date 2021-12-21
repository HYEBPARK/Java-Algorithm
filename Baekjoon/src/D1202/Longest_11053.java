package D1202;

import java.util.Scanner;

public class Longest_11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int dp[] = new int[N];
        for(int i = 0 ; i<N; i++){
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }
        int max = dp[0];
        for(int i = 1;i<N;i++){
         for(int k = i; k>=0; k--){
             if(arr[i] > arr[k]){
                 dp[i] = Math.max(dp[k] + 1,dp[i]);
                 if(dp[i] > max) max = dp[i];
             }
         }
        }

        System.out.println(max);
    }
}
