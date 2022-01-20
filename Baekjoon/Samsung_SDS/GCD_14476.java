import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class GCD_14476 {
    static int gcdLtoR[];
    static int gcdRtoL[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) num[i] = Integer.parseInt(st.nextToken());
        gcdLtoR = new int[N];
        gcdRtoL = new int[N];
        gcdLtoR[0] = num[0];
        gcdRtoL[N - 1] = num[N - 1];

        for (int i = 1; i < N; i++) {
            gcdLtoR[i] = gcd(gcdLtoR[i - 1], num[i]);
        }
        for (int i = N - 2; i >= 0; i--) {
            gcdRtoL[i] = gcd(gcdRtoL[i + 1], num[i]);
        }

        int max = 0 ;
        boolean flag = false;
        int maxIndex = 0;
        for (int i = 0; i < N; i++) {
            int gcd = 0;
            if(i==0){
                gcd = gcdRtoL[1];
            }else if(i == N-1){
                gcd = gcdLtoR[N - 2];
            } else{
                gcd =gcd(gcdLtoR[i-1], gcdRtoL[i+1]);
            }
            if(num[i] % gcd != 0&& gcd > max) {
                max = gcd;
                maxIndex = i;
                flag = true;
            }
        }
        if(!flag) System.out.println(-1);
        else System.out.println(max +" "+ num[maxIndex]);

    }


    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
