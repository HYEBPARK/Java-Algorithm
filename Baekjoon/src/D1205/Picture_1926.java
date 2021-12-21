package D1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Picture_1926 {
    static int map[][], N, K, size = 1;
    static boolean visited[][];
    static int dr[] = {0, 0, 1, -1};
    static int dc[] = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][K];
        visited = new boolean[N][K];

        int answer = 0, max = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int k = 0; k < K; k++) {
                map[i][k] = Integer.parseInt(st1.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < K; k++) {
                if (map[i][k] == 1 && visited[i][k] == false) {
                    answer++;
                    dfs(i,k);
                    if(max < size) max = size;
                    size = 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer).append("\n").append(max);
        System.out.println(sb);
    }

    private static void dfs(int r, int c) {
        visited[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nc >= 0 && nr < N && nc < K) {
                if (!visited[nr][nc] && map[nr][nc] == 1) {
                    visited[nr][nc] = true;
                    size++;
                    dfs(nr, nc);
                }
            }
        }
    }
}

