package D1203;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hideNseek_1697 {
    static int map[], dn[] = {-1, 1, 2}, min;
    static boolean visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        map = new int[100001];
        visited = new boolean[100001];
        min = 10000000;
        if (N == K) System.out.println(0);
        else bfs(N, K);
    }

    public static void bfs(int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        visited[N] = true;
        boolean flag = false;
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int i = 0; i < 3; i++) {
                int n;
                if (i < 2) n = cur + dn[i];
                else n = cur * dn[i];

                if (n < 0 || n > 100000 || visited[n]) continue;
                map[n] = map[cur] + 1;
                if (n == K) {
                    System.out.println(map[n]);
                    flag = true;
                    break;
                }
                visited[n] = true;
                q.offer(n);
            }
            if (flag) break;
        }
    }
}

