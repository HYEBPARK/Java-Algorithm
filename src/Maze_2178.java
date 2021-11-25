import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze_2178 {
    static class Node {
        int r, c;

        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    private static Queue<Node> q = new LinkedList<>();
    private static int dr[] = {1, 0, -1, 0};
    private static int dc[] = {0, 1, 0, -1};
    private static int map[][], N, M;
    private static boolean visited[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String num = sc.next();
            for (int k = 0; k < M; k++) {
                int realNum = num.charAt(k) - 48;
                map[i][k] = realNum;
            }
        }

        q.add(new Node(0, 0));
        visited[0][0] = true;

        bfs();

    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (nr > N - 1 || nc > M - 1 || nr < 0 || nc < 0) continue;
                if (visited[nr][nc] == true) continue;
                if (map[nr][nc] == 0) continue;

                map[nr][nc] = map[cur.r][cur.c] + 1;
                q.add(new Node(nr, nc));
                visited[nr][nc] = true;
            }
        }
        System.out.println(map[N - 1][M - 1]);
    }
}
