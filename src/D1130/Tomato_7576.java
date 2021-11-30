package D1130;

import java.util.*;

public class Tomato_7576 {
    static class Node {
        int r, c;

        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static int N, K;
    static int map[][];
    static boolean visited[][];
    static Queue<Node> s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        map = new int[K][N];
        s = new LinkedList<>();
        visited = new boolean[K][N];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1) {
                    s.add(new Node(i, j));
                    visited[i][j] = true;
                }
            }
        }
        System.out.println(BFS());
    }

    public static int BFS() {
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};

        while (!s.isEmpty()) {
            Node cur = s.poll();
            for (int i = 0; i < 4; i++) {
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (nr >= K || nc >= N || nr < 0 || nc < 0) continue;
                if (visited[nr][nc] == true) continue;
                if (map[nr][nc] == -1) continue;

                map[nr][nc] = map[cur.r][cur.c] + 1;
                visited[nr][nc] = true;
                s.add(new Node(nr, nc));
            }
        }
        int max = 0;
        for (int i = 0; i < K; i++) {
            for (int k = 0; k < N; k++) {
                if (map[i][k] == 0) return -1;
                if (max < map[i][k]) max = map[i][k];
            }
        }
        if(max == 1 || max == 0) return 0;
        else return max-1;
    }
}


