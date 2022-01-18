package D0114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int S = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] num = new int[N+1];
        for (int i = 0; i < N; i++) num[i] = Integer.parseInt(st2.nextToken());
        int low = 0, high = 0, sum = num[0], length = 100001;
        while (true) {

            if (sum >= S) {
                length = Math.min(length,high-low+1);
                sum -= num[low++];
            } else {
                sum += num[++high];
            }
            if(high == N) break;

        }
        if (length == 100001) System.out.println(0);
        else System.out.println(length);
    }
}
