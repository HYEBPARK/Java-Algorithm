import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNum_1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

    }

    public static void primenum(int a, int b) {
        for (int i = a; i <= b; i++) {
            boolean flag = true;
            if(i==1) flag = false;
            for (int k = 2; k * k <= i; k++) {
                if (i % k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) System.out.println(i);
        }
    }
}
