import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class strRe_2675 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int A = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String sb="";
            for(int k = 0; k<str.length();k++){
                for(int j = 0; j<A; j++ ) sb += str.charAt(k);
            }
            System.out.println(sb);
        }
    }
}
