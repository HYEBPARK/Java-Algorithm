import java.util.*;

class Solution_77485 {

    class Node{
        int r,c;

        public Node(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public int[] solution(int rows, int columns, int[][] queries) {

        List<Integer> list = new ArrayList<>();
        int[][] map = new int[rows][columns];
        int number = 1;
        for(int i = 0; i<map.length ; i++){
            for(int k =0; k<map[i].length; k++){
                map[i][k] =  number++;
            }
        }
        int dr[] = {0,1,0,-1};
        int dc[] = {1,0,-1,0};
        Queue<Node> q = new LinkedList<>();
        for(int i = 0; i<queries.length; i++){
            q.add(new Node(queries[i][0]-1,queries[i][1]-1));
            boolean visited[][] = new boolean[rows][columns];
            int tmp = map[queries[i][0]-1][queries[i][1]-1];
            int min = map[queries[i][0]-1][queries[i][1]-1];
            while (!q.isEmpty()){
                Node cur = q.poll();

                int nr = cur.r , nc = cur.c;

                for(int k = 0; k<4; k++){

                    nr = cur.r +dr[k];
                    nc = cur.c + dc[k];

                    if(nr < queries[i][0]-1 || nr > queries[i][2]-1 || nc <queries[i][1]-1 || nc > queries[i][3]-1) continue;
                    if(nr>queries[i][0]-1 && nr < queries[i][2]-1 && nc> queries[i][1]-1 && nc< queries[i][3]-1) continue;
                    if(visited[nr][nc] == true) continue;

                    q.add(new Node(nr,nc));
                    visited[nr][nc] = true;
                    int tmp2 = map[nr][nc];
                    if(min > map[nr][nc]) min = map[nr][nc];
                    map[nr][nc] = tmp;
                    tmp = tmp2;
                    break;
                }
            }
            list.add(min);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size();i++)
        {
            answer[i] = list.get(i);
        }

        return answer;
    }
}


public class Spin_77485 {
    public static void main(String[] args) {
        Solution_77485 sol = new Solution_77485();
        System.out.println(Arrays.toString(sol.solution(6,6,new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}})));
    }
}
