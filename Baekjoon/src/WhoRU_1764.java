
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class WhoRU_1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        HashSet hs = new HashSet();
        for (int i = 0; i < N; i++) {
            hs.add(br.readLine());
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            String name = br.readLine();
            if (hs.contains(name)) {
                cnt++;
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(String i : list) System.out.println(i);
    }
}
