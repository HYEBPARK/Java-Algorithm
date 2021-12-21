package D1202;

import java.util.HashSet;
import java.util.Scanner;

public class LIS_14002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int arr[] = new int[N];
        int dp[] = new int[N];
        for(int i = 0 ;i<N; i++){
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }
        int max = 1;
        int maxIndex = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            for(int k = i; k>=0; k--){
                if(arr[i] > arr[k]) {
                    dp[i] = Math.min(dp[k]+1,dp[i]);
                    if(max < dp[i]){
                        max = dp[i];
                        maxIndex = i;
                    }
                }

            }
        }

    }
}
