import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prime_1978 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            boolean flag = true;
            if (a == 1) flag = false;
            for (int k = 2; k < a; k++) {
                if (a % k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) cnt++;
        }
        System.out.println(cnt);
    }
}
