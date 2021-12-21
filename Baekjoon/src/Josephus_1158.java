import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Josephus_1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> q = new ArrayList<>();
        for(int i =1 ; i<N+1; i++) q.add(i);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (q.size()>1){
            for(int i = 0; i<K-1;i++) {
                q.add(q.remove(0));
            }
            sb.append(q.remove(0)+", ");
        }
        sb.append(q.remove(0));
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
