import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX_8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str[] = new String[N];
        for (int i = 0; i < N; i++) str[i] = br.readLine();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int cnt = 1;
            for (int k = 0; k < str[i].length(); k++) {
                if (str[i].charAt(k) == 'O') {
                    sum += cnt;
                    cnt++;
                } else cnt = 1;
            }
            System.out.println(sum);
        }

    }
}
