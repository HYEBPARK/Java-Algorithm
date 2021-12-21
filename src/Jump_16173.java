import java.util.Scanner;
import java.util.Stack;

public class Jump_16173 {
    private static int dr[] = {0, 1};
    private static int dc[] = {1, 0};
    private static Stack<Node> q = new Stack<>();
    private static int map[][], N;
    private static boolean success = false;

    static class Node {
        int r, c;

        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                map[r][c] = sc.nextInt();
            }
        }
        q.push(new Node(0, 0));
        bfs();
    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Node cur = q.pop();
            if (map[cur.r][cur.c] == -1) {
                success = true;
                System.out.println("HaruHaru");
                break;
            }

            for (int d = 0; d < 2; d++) {

                int nr = cur.r + dr[d] * map[cur.r][cur.c];
                int nc = cur.c + dc[d] * map[cur.r][cur.c];

                if (nr > N - 1 || nc > N - 1 || nr < 0 || nc < 0) continue; // map 을 벗어나지 않도록
                if (map[nr][nc] > N || map[nr][nc] == 0) continue; // 칸에는  0 이상 100 이하의 정수가 있음
                q.push(new Node(nr, nc));
            }
        }
        if (success == false) System.out.println("Hing");
    }
}
