package D1207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Alpabet_1987 {
    public static class Node {
        int r, c;

        public Node(int r,int c) {
            this.r = r;
            this.c = c;

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col =  Integer.parseInt(st.nextToken());
        char map [][] = new char[row][col];
        for(int i = 0; i<row; i++){
            String str = br.readLine();
            for(int k = 0 ; k<col; k++){
                map[i][k] = str.charAt(k);
            }
        }
        List<Character> list = new ArrayList<>();
        boolean visited[][] = new boolean[row][col];
        int dr[] = {0,0,1,-1};
        int dc[] = {1,-1,0,0};
        Stack<Node> q = new Stack<>();
        q.push(new Node(0,0));
        list.add(map[0][0]);
        visited[0][0] = true;
        while (!q.isEmpty()){
            Node cur = q.pop();
            for(int i = 0 ; i<4; i++){
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if(nr < 0 || nc <0 || nr >= row || nc >= col || visited[nr][nc]) continue;
                if(list.contains(map[nr][nc])) continue;
                q.push(new Node(nr,nc));
                visited[nr][nc] = true;
                list.add(map[nr][nc]);
                break;
            }
        }
        System.out.println(list.size());
    }
}
