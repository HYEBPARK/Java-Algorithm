package D1207;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hideNseek_13549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subin = sc.nextInt();
        int sister = sc.nextInt();
        int map[] = new int[100001];
        boolean visited[] = new boolean[100001];
        int dr[] = {2,-1,1};
        boolean flag = false;
        Queue<Integer> q = new LinkedList<>();
        q.add(subin);
        visited[subin] = true;
        if(subin >= sister) System.out.println(subin-sister);
        else {
            while (!q.isEmpty()) {
                int cur = q.poll();
                int nr = 0;
                for (int i = 0; i < 3; i++) {
                    if (i == 0) nr = cur * 2;
                    else nr = cur + dr[i];

                    if (nr < 0 || nr > 100000 || visited[nr]) continue;
                    if (i == 0) map[nr] = map[cur];
                    else map[nr] = map[cur] + 1;

                    if (nr == sister) {
                        System.out.println(map[nr]);
                        flag = true;
                        break;
                    }
                    q.offer(nr);
                    visited[nr] = true;
                }
                if(flag) break;
            }
        }
    }
}
