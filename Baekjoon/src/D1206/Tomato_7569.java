package D1206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato_7569 {

    public static class Node {
        int r, c, z;

        public Node(int z,int r, int c) {
            this.z = z;
            this.r = r;
            this.c = c;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int Z = Integer.parseInt(st.nextToken());

        int map[][][] = new int[Z][N][M];
        boolean visited[][][] = new boolean[Z][N][M];
        Queue<Node> q = new LinkedList<>();
        for(int i = 0; i<Z; i++){
            for(int k = 0; k<N; k++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for(int j = 0 ; j<M; j++){
                    map[i][k][j] = Integer.parseInt(st1.nextToken());
                    if(map[i][k][j] == 1){
                        q.offer(new Node(i,k,j));
                        visited[i][k][j] = true;
                    }
                }
            }
        }

        int dr [] = {0,0,1,-1,0,0};
        int dc [] = {1,-1,0,0,0,0};
        int dz [] = {0,0,0,0,1,-1};
        int day = 0;
        while (!q.isEmpty()){
            Node cur = q.poll();
            for(int i = 0 ; i<6; i++){
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];
                int nz = cur.z + dz[i];

                if(nr < 0 || nc < 0 || nz < 0 || nr >= N || nc >= M || nz >= Z) continue;
                if(visited[nz][nr][nc] || map[nz][nr][nc] != 0) continue;
                map[nz][nr][nc] = map[cur.z][cur.r][cur.c] + 1;
                visited[nz][nr][nc] = true;
                q.offer(new Node(nz,nr,nc));
                if(day < map[nz][nr][nc]) day = map[nz][nr][nc];
            }
        }
        for(int i = 0; i<Z; i++){
            for(int k = 0; k<N; k++){
                for(int j = 0 ; j<M; j++){
                    if(map[i][k][j] == 0){
                       day = -1;
                    }
                }
            }
        }
        if(day == -1 || day == 0) System.out.println(day);
        else System.out.println(day - 1);
    }
}


