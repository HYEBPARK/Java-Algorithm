import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ShortPath_1753 {
    static int dp[];
    static List<List<Edge>> graph;
    static boolean visited[];
    static class Edge{
        int x;
        int weight;
        public Edge(int x, int weight)
        {
            this.x = x;
            this.weight = weight;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer VE = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(VE.nextToken());
        int E = Integer.parseInt(VE.nextToken());
        StringTokenizer Start = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(Start.nextToken());
        visited = new boolean[V + 1];
        dp = new int[V + 1];
        graph = new ArrayList<>();
        for (int i = 0; i < V+1 ; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
        }
        dijkstra(K);
        for(int i = 1; i<dp.length; i++)
        {
            if(dp[i] == Integer.MAX_VALUE)
                sb.append("INF");
            else
                sb.append(dp[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void dijkstra(int K)
    {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
        Arrays.fill(dp,Integer.MAX_VALUE);
        pq.offer(new Edge(K,0));
        dp[K] = 0;
        while (!pq.isEmpty())
        {
            Edge cur = pq.poll();
            if(visited[cur.x])
                continue;
            visited[cur.x] = true;
            for(Edge next : graph.get(cur.x))
            {
                if(dp[next.x] >= dp[cur.x] + next.weight)
                {
                    dp[next.x] = dp[cur.x] + next.weight;
                    pq.add(new Edge(next.x, dp[next.x]));
                }
            }
        }
    }
}
