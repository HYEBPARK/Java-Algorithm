package D1208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TreeParent_11725 {
    static List<Integer>[] list;
    static int parents[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        list =  new ArrayList[N+1];
        visited = new boolean[N+1];
        parents = new int[N+1];
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=N ; i++) list[i] = new ArrayList();
        for(int i = 0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Node1 = Integer.parseInt(st.nextToken());
            int Node2 = Integer.parseInt(st.nextToken());
            list[Node1].add(Node2);
            list[Node2].add(Node1);
            }
        dfs(1);
        for(int i = 2 ; i<parents.length; i++) sb.append(parents[i]).append("\n");
        System.out.println(sb);
        }

    public static void dfs(int i) {
        visited[i] = true;
        for (int num : list[i]) {
            if (!visited[num]) {
                parents[num] = i;
                dfs(num);
            }
        }
    }
}
