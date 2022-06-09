import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	int r;
	int c;

	public Node(int r, int c) {
		this.r = r;
		this.c = c;
	}
}

public class P_17129 {
	public static int n, m, answer;
	public static int[][] map;
	public static int[][] visited;
	public static int[] dr = {1, -1, 0, 0};
	public static int[] dc = {0, 0, 1, -1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		answer = 0;
		map = new int[n][m];
		visited = new int[n][m];
		Node start = new Node(0, 0);

		for (int i = 0; i < n; i++) {
			String line = sc.next();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j) - 48;
				if (map[i][j] == 2) {
					start = new Node(i, j);
				}
			}
		}

		Queue<Node> q = new LinkedList<>();
		q.add(start);
		visited[start.r][start.c] = 1;

		answer = bfs(q);

		if (answer == 0)
			System.out.println("NIE");
		else {
			System.out.println("TAK");
			System.out.println(answer - 1);
		}
	}

	private static int bfs(Queue<Node> q) {
		while (!q.isEmpty()) {
			Node cur = q.poll();
            
			for (int i = 0; i < 4; i++) {
				int nr = cur.r + dr[i];
				int nc = cur.c + dc[i];

				if (nr < 0 || nc < 0 || nr >= n || nc >= m)
					continue;
				if (visited[nr][nc] > 0 || map[nr][nc] == 1)
					continue;
				if (map[nr][nc] == 3 || map[nr][nc] == 4 || map[nr][nc] == 5) {
					if (answer == 0 || answer > visited[cur.r][cur.c] + 1)
						answer = visited[cur.r][cur.c] + 1;
				}
				visited[nr][nc] = visited[cur.r][cur.c] + 1;
				q.add(new Node(nr, nc));
			}
		}
        
		return answer;
	}
}
