import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Loc_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num[] = new int[N];
        for (int i = 0; i <N ; i++) {
            int n =  Integer.parseInt(st.nextToken());
            num[i] = n;
        }
        int numArr[] = num.clone();
        Arrays.sort(numArr);
        HashMap<Integer,Integer> hs = new HashMap<>();
        int rank = 0;
        for(int i : numArr) if(!hs.containsKey(i)) hs.put(i,rank++);
        for(int i : num) sb.append(hs.get(i)).append(" ");
        System.out.println(sb);
    }
}
