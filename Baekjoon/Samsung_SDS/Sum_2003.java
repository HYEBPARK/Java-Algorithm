import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int []numArr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++) numArr[i] = Integer.parseInt(st1.nextToken());
        int low = 0, high = 0, sum = 0, cnt = 0;
        while (low < N && high <N){
            for (int i = low; i <= high ; i++) {
                sum += numArr[i];
            }
            if(sum == M) {
                low++;
                cnt++;
            }
            else if(sum > M) {
                low ++;
            }
            else high ++;
            if(low >= N || high >=N) break;
            sum = 0;

        }
        System.out.println(cnt);
    }
}
