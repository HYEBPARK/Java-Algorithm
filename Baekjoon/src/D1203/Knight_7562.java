package D1203;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Knight_7562 {
    static int map[][];
    static boolean visited[][];
    public static class Node{
        int r,c;
        public Node(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int dr[] = {-2,-2,-1,1,2,2,1,-1};
        int dc[] = {-1,1,2,2,1,-1,-2,-2};
        for(int i = 0; i<T; i++){
            int N =sc.nextInt();
            map = new int[N][N];
            visited = new boolean[N][N];
            Queue<Node> q = new LinkedList<>();
            q.offer(new Node(sc.nextInt(),sc.nextInt()));
            visited[q.peek().r][q.peek().c] = true;
            Node end = new Node(sc.nextInt(),sc.nextInt());
            boolean flag = false;
            if(q.peek().r == end.r && q.peek().c == end.c) System.out.println(0);
            else {
                while (!q.isEmpty()) {
                    Node cur = q.poll();

                    for (int k = 0; k < 8; k++) {
                        int nr = cur.r + dr[k];
                        int nc = cur.c + dc[k];

                        if (nr >= 0 && nc >= 0 && nr < N && nc < N && !visited[nr][nc]) {
                            map[nr][nc] = map[cur.r][cur.c] + 1;
                            if (nr == end.r && nc == end.c) {
                                System.out.println(map[nr][nc]);
                                flag = true;
                                break;
                            }
                            q.offer(new Node(nr, nc));
                            visited[nr][nc] = true;
                        }
                    }
                    if (flag) break;
                }
            }
        }
    }
}
