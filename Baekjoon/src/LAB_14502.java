import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LAB_14502 {
    static int N,M;
    static int map[][];
    static  List<Node> list;
    public static class Node{
        int r;
        int c;
        public Node(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer first_line = new StringTokenizer(br.readLine());
        N = Integer.parseInt(first_line.nextToken());
        M = Integer.parseInt(first_line.nextToken());
        map = new int[N][M];
        list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M ; j++) {
                int map_num = Integer.parseInt(st.nextToken());
                map[i][j] = map_num;
                if(map_num == 0)
                    list.add(new Node(i,j));
            }
        }
        int copy_map[][] = new int[N][M];
        int max = 0;
        make_wall(copy_map, max);
        System.out.println(max);
    }
    public static int bfs(int [][]copy)
    {
        int cnt = 0;
        int dr[] = {1,-1,0,0};
        int dc[] = {0,0,1,-1};
        Queue<Node> q = new LinkedList<>();
        boolean visited[][] = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(copy[i][j] == 2)
                    q.add(new Node(i,j));
            }
        }
        visited[q.peek().r][q.peek().c] = true;
        while(!q.isEmpty()){
            Node cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];
                if(nr >= N || nc >= M || nr < 0 || nc < 0)
                    continue;
                if(visited[nr][nc])
                    continue;
                if(copy[cur.r][cur.c] == 2){
                    if(copy[nr][nc] != 1)
                    {
                        copy[nr][nc] = 2;
                        q.add(new Node(nr,nc));
                    }
                    visited[nr][nc] = true;
                }
            }
        }
        safe_zone_check(copy, cnt);
        return cnt;
    }
    public static void safe_zone_check(int copy[][],int cnt)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(copy[i][j] == 0)
                    cnt++;
            }
        }
    }
    public static void init_map(int copy[][])
    {
        for (int l = 0; l < N; l++) {
            for (int m = 0; m < M; m++) {
                copy[l][m] = map[l][m];
            }
        }
    }
    public static void make_wall(int copy_map[][], int max)
    {
        int safe_zone = 0;
        for (int i = 0; i < list.size()-2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    init_map(copy_map);
                    copy_map[list.get(i).r][list.get(i).c] = 1;
                    copy_map[list.get(j).r][list.get(j).c] = 1;
                    copy_map[list.get(k).r][list.get(k).c] = 1;
                    safe_zone = bfs(copy_map);
                    if(safe_zone > max)
                        max = safe_zone;
                    copy_map[list.get(k).r][list.get(k).c] = 0;
                    if(k == list.size() - 1)
                        copy_map[list.get(j).r][list.get(j).c] = 0;
                    if(j == list.size() - 2)
                        copy_map[list.get(i).r][list.get(i).c] = 0;
                }
            }
        }
    }
   
}
