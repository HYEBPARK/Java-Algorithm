import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCD_2609 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int GCD=0, LCM =0;
        int tmp = a;
        if(b>a) {
            a = b;
            b = tmp;
        }
        if(a%b == 0) {
            GCD = b;
            LCM = b * (a/b);
        }
        else {
            for (int i = b / 2; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    GCD = i;
                    LCM = i * (a / i) * (b / i);
                    break;
                }
            }
        }

        if(a==b) GCD = LCM = a;
        System.out.println(GCD);
        System.out.println(LCM);
    }
}
