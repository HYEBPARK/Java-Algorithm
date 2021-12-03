package D1203;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Island_4963 {
    public static class Node{
        int r,c;
        public Node(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (w != 0 && h != 0){
            int map[][] = new int[h][w];
            boolean visited[][] = new boolean[h][w];

            for(int i = 0 ; i<h ; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int k = 0; k < w; k++) {
                    map[i][k] = Integer.parseInt(st1.nextToken());
                }
            }

            int dr [] = {0,0,-1,1,-1,-1,1,1};
            int dc [] = {-1,1,0,0,-1,1,-1,1};
            Stack<Node> s = new Stack<>();
            int cnt = 0;
            for(int j = 0; j<h ; j++){
                for(int l = 0; l<w; l++){
                    if(map[j][l]==1 && !visited[j][l]){
                        s.push(new Node(j,l));
                        visited[j][l] = true;
                        cnt++;
                        while (!s.isEmpty()){
                            Node cur = s.pop();
                            for(int i =0 ; i<8 ; i++){
                                int nr = cur.r + dr[i];
                                int nc = cur.c + dc[i];

                                if(nr > h-1 || nc > w-1 || nr < 0 || nc < 0) continue;
                                if(visited[nr][nc] == true) continue;
                                if(map[nr][nc] == 0) continue;

                                s.push(new Node(nr,nc));
                                visited[nr][nc] = true;
                            }
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
            StringTokenizer st2 = new StringTokenizer(br.readLine());
             w = Integer.parseInt(st2.nextToken());
             h = Integer.parseInt(st2.nextToken());
        }
        System.out.println(sb);
    }
}
