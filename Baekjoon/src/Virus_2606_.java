import java.util.Scanner;

public class Virus_2606_ {

    private static int map[][], computer, pair, cnt = 0;
    private static boolean visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computer = sc.nextInt();
        pair = sc.nextInt();
        map = new int[computer + 1][computer + 1];
        visited = new boolean[computer + 1];

        for (int i = 0; i < pair; i++) {
            int var1 = sc.nextInt();
            int var2 = sc.nextInt();
            map[var1][var2] = map[var2][var1] = 1;
        }
        dfs(1);
        System.out.println(cnt);
    }

    private static void dfs(int v) {

        visited[v] = true;

        for (int j = 0; j < map.length; j++) {
            if (map[v][j] == 1 && visited[j] == false) {
                visited[j] = true;
                cnt++;
                dfs(j);
            }
        }
    }
}
