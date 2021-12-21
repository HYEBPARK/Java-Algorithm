package D1121;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class PQ {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> t  = new TreeMap<>();
            for (int k = 0; k < K; k++) {
                String s = br.readLine();
                StringTokenizer st = new StringTokenizer(s," ");
                String str = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                switch (str) {
                    case "I":
                        if(t.containsKey(num)) t.put(num,t.get(num)+1);
                        else t.put(num,0);
                        System.out.println(t);
                        break;
                    case "D":
                        if (t.isEmpty()) break;
                        else if (num == 1) {
                            if(t.get(t.lastKey()) > 0) t.put(t.lastKey(),t.get(t.lastKey())-1);
                            else t.remove(t.lastKey());
                        }
                        else {
                            if(t.get(t.firstKey())>0) t.put(t.firstKey(),t.get(t.firstKey())-1);
                            else t.remove(t.firstKey());
                        }
                        System.out.println(t);
                        break;
                }
            }
            if (t.isEmpty()) System.out.println("EMPTY");
            else System.out.println(t.lastKey()+" "+t.firstKey());
        }

    }
}