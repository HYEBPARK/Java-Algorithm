package D1124;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Fashion_9375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<N; i++){
            int K = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for(int k = 0; k<K; k++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                if(!map.containsKey(type)) map.put(type,2);
                else map.put(type,map.get(type)+1);
            }
            int mul = 1;
            int sum = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                sum += value;
                if(map.size() > 1) mul *= value;
            }
            if(map.size()>1) System.out.println(mul-1);
            else System.out.println(sum-map.size());

        }
    }
}
