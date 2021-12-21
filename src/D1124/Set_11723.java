package D1124;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Set_11723 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "add": hs.add(Integer.parseInt(st.nextToken()));
                                break;
                case "remove": hs.remove(Integer.parseInt(st.nextToken()));
                                break;
                case "check": if(hs.contains(Integer.parseInt(st.nextToken()))) sb.append(1).append("\n") ;
                                else sb.append(0).append("\n");
                                break;
                case "toggle":  int num = Integer.parseInt(st.nextToken());
                                if(hs.contains(num)) hs.remove(num);
                                else hs.add(num);
                                break;
                case "all":  for(int k = 1; k<=20; k++) hs.add(k);
                             break;
                case "empty": hs.clear();
                                break;

            }
        }
        System.out.println(sb);
    }
}
