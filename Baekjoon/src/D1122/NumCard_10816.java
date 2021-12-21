package D1122;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NumCard_10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N= Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> t = new HashMap<>();
        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1);
        for(int i = 0 ; i< N; i++){
            int num = Integer.parseInt(st1.nextToken());
            if(t.containsKey(num)) t.put(num,t.get(num)+1);
            else t.put(num,1);
        }
        int K = Integer.parseInt(br.readLine());
        String s2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s2);
        for(int k = 0; k<K; k++){
            int num = Integer.parseInt(st2.nextToken());
            if(t.containsKey(num)) sb.append(t.get(num)).append(" ");
            else sb.append(0).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
