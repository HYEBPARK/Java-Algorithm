import java.util.*;

public class DFSBFS_1260 {
    private static Queue<Integer> BFS = new LinkedList<>();
    private static Stack<Integer> DFS = new Stack<>();
    private static int N,M,V;
    private static LinkedList<Integer> list[];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         N = sc.nextInt(); // 정점
         M = sc.nextInt(); // 간선
         V = sc.nextInt(); // 시작 정점

        list = new LinkedList[N + 1];
        for (int i = 0; i < N+1; i++) {
            list[i] = new LinkedList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        for(int i = 0;i<N+1;i++) Collections.sort(list[i]);

        dfs();
        bfs();
    }


    private static void dfs(){
        boolean visited_dfs[] = new boolean[N+1];
        DFS.push(V);
        visited_dfs[V] = true;
        System.out.print(V + " ");
        while (!DFS.isEmpty()) {
            int cur = DFS.peek();
            boolean flag = false;
            for (int i = 0; i < list[cur].size(); i++) {
                if (visited_dfs[list[cur].get(i)] == true) continue;
                DFS.push(list[cur].get(i));
                flag = true;
                visited_dfs[list[cur].get(i)] = true;
                System.out.print(list[cur].get(i) + " ");
                break;
            }

            if (flag == false) DFS.pop();

        }
    }

    private static void bfs(){
        boolean visited_bfs[] =new boolean[N+1];

        BFS.add(V);
        System.out.print("\n");
        visited_bfs[V] = true;
        while(!BFS.isEmpty()){
            int cur = BFS.poll();
            System.out.print(cur+" ");
            for(int i = cur; i<N+1; i++){
                for(int k = 0; k<list[cur].size();k++){
                    if(visited_bfs[list[cur].get(k)] == true) continue;
                    BFS.add(list[cur].get(k));
                    visited_bfs[list[cur].get(k)] = true;
                }
            }
        }

    }
}


