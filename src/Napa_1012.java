import java.util.Scanner;

public class Napa_1012 {
    static boolean visited[][];
    static int map[][], dr[], dc[], M, N, K;

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nr = x + dr[i];
            int nc = y + dc[i];
            if (nc >= 0 && nr >= 0 && nc < N && nr < M) {
                if (!visited[nr][nc] && map[nr][nc] == 1) {
                    dfs(nr, nc);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            map = new int[M][N];
            visited = new boolean[M][N];
            dr = new int[]{1, -1, 0, 0};
            dc = new int[]{0, 0, 1, -1};
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[x][y] = 1;
            }
            int cnt = 0;
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        dfs(x, y);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
