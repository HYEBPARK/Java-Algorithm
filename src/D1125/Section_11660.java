package D1125;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Section_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int map[][] = new int[N + 1][N + 1];
        int max = 0;
        for (int i = 1; i <= N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int k = 1; k <= N; k++) {
                map[i][k] = Integer.parseInt(st1.nextToken());
                max += map[i][k];
            }
        }
        int range[][] = new int[M + 1][5];
        for (int i = 1; i <= M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int k = 1; k <= 4; k++) {
                range[i][k] = Integer.parseInt(st2.nextToken());
            }
        }
        int dp[][] = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + map[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=M ; i++){
            int sum = 0;
            sum += dp[range[i][3]][range[i][4]]-dp[range[i][3]][range[i][2]-1]-dp[range[i][1]-1][range[i][4]]+dp[range[i][1]-1][range[i][2]-1];
            sb.append(sum).append("\n");
            }
        System.out.println(sb);
    }
}