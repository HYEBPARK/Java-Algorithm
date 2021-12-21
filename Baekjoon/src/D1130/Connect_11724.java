package D1130;

import java.util.Scanner;

public class Connect_11724 {
    static boolean visited[];
    static int map[][];
    static int k , n;

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
         n = sc.nextInt();
         k = sc.nextInt();
        visited = new boolean[n+1];
        map = new int[n+1][n+1];
        for(int i = 0 ; i<k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 1;
            map[y][x] = 1;
        }
        int cnt = 0;
        for(int i = 1; i<=n ; i++){
            if(!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static void dfs(int i) {
       visited[i] = true;
       for(int j = 1; j<=n; j++){
          if(map[i][j] == 1 && !visited[j]) dfs(j);
       }
    }
}
