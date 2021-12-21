import java.util.*;

public class APT_2667 {
    static int map[][],N,cnt=1;
    static int dr[] = {0,0,1,-1};
    static int dc[] = {1,-1,0,0};
    static boolean visited[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for(int i = 0 ; i< N; i++){
            String s= sc.next();
            for(int k = 0 ; k<N ;k++){
                map[i][k] = s.charAt(k)-48;
            }
        }
        List<Integer> list = new ArrayList<>();
        visited = new boolean[N][N];
        for(int i = 0; i<N; i++){
            for(int k =0; k<N; k++){
                if(map[i][k]==1 && !visited[i][k]) {
                    dfs(i,k);
                    list.add(cnt);
                    cnt = 1;
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int i : list) System.out.println(i);


    }

    private static void dfs(int r, int c) {
        visited[r][c] = true;

        for(int i= 0; i<4 ; i++){
            int nr = r+dr[i];
            int nc = c+dc[i];

            if(nr>=0 && nc >=0 && nr<N && nc<N){
                if(!visited[nr][nc] && map[nr][nc]==1) {
                    visited[nr][nc] = true;
                    cnt++;
                    dfs(nr, nc);
                }
            }
        }
    }
}
