import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Boggle_9202 {
    static Node dirArr[]; // 사전 배열
    static boolean visited[][]; // 방문 체크
    static char board[][]; // 보드판
    static int sum, cnt; // 점수 합계, 단여 수
    static int score[] = {0, 0, 0, 1, 1, 2, 3, 5, 11}; // 점수판
    static int[] mx = {1, 0, 0, -1, -1, 1, 1, -1}; // x 좌표 이동
    static int[] my = {0, 1, -1, 0, -1, -1, 1, 1}; // y 좌표 이동
    static StringBuilder sb; // 단어 체크
    static String answer; // 정답

    public static class Node {
        Node child[]; // childeren 배열
        boolean isEnd; // 리프 노드인지 체크
        boolean isHit; // 중복 단어 체크

        public Node(Node child[], boolean isEnd, boolean isHit) {
            this.child = child;
            this.isEnd = isEnd;
            this.isHit = isHit;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dir = Integer.parseInt(br.readLine());
        dirArr = new Node[27];
        sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        // 사전 배열 입력
        for (int i = 0; i < dir; i++) {
            String s = br.readLine();
            for (int k = 0; k < s.length(); k++) {
                if (k == 0 && dirArr[s.charAt(0) - 'A'] == null)
                    dirArr[s.charAt(0) - 'A'] = new Node(new Node[27], false, false);
                else if (k > 0) {
                    insert(dirArr[s.charAt(k - 1) - 'A'], s, k);
                    break;
                }
            }
        }
        br.readLine(); // 띄어쓰기

        int map = Integer.parseInt(br.readLine()); // 보드판의 수
        board = new char[4][4]; // 보드판

        // 보드 배열 입력
        for (int i = 0; i < map; i++) {
            for (int j = 0; j < 4; j++) {
                String str = br.readLine();
                for (int k = 0; k < 4; k++) {
                    board[j][k] = str.charAt(k);
                }
            }

            sum = 0; // 점수 합
            cnt = 0; // 찾은 단어 수
            answer = ""; // 제일 긴 단어
            visited = new boolean[4][4];

            // 보드 search
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (dirArr[board[j][k] - 'A'] != null) search(j, k, 0, dirArr[board[j][k] - 'A']);
                }
            }
            // hit = false로 초기화
            for (Node node : dirArr) {
                if (node != null) clearHit(node);
            }

            // 띄어쓰기
            br.readLine();

            result.append(sum).append(" ").append(answer).append(" ").append(cnt).append("\n");
        }
        System.out.println(result);
    }

    public static void search(int y, int x, int length, Node node) {
        //1. 체크인
        visited[y][x] = true;
        sb.append(board[y][x]);
        // 2. 목적지 도달
        if (node.isEnd && !node.isHit) {
            node.isHit = true;
            sum += score[sb.length()];
            String str = sb.toString();
            cnt++;
            compare(str, answer);
        }
        // 3. 연결된 곳을 순회
        for (int i = 0; i < 8; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];

            // 4. 가능한가? - map 경계, visited , node가 해당자식을 가지고 있는가

            if (nx < 0 || ny < 0 || nx >= 4 || ny >= 4) continue;
            if (visited[ny][nx] || node.child[board[ny][nx] - 'A'] == null) continue;
            //  5. 간다.

            search(ny, nx, length + 1, node.child[board[ny][nx] - 'A']);


        }
        // 6. 체크아웃
        visited[y][x] = false;
        sb.deleteCharAt(sb.length() - 1);

    }

    // 제일 긴 문자열 && 알파벳 순서
    private static void compare(String str, String ans) {
        if (str.length() > ans.length()) answer = str;
        else if (str.length() == ans.length()) {
            String[] arr = {str, ans};
            Arrays.sort(arr);
            answer = arr[0];
        }
    }

    // 사전 배열에 삽입
    public static void insert(Node node, String s, int k) {

        if (k == s.length() - 1) {
            Node n = node.child[s.charAt(k) - 'A'];
            if (n == null)
                n = new Node(new Node[27], true, false);
            else n.isEnd = true;
        } else if (node.child[s.charAt(k) - 'A'] == null) {
            node.child[s.charAt(k) - 'A'] = new Node(new Node[27], false, false);
            insert(node.child[s.charAt(k) - 'A'], s, k + 1);
        } else insert(node.child[s.charAt(k) - 'A'], s, k + 1);
    }

    public static void clearHit(Node node) {
        node.isHit = false;
        for (int i = 0; i < node.child.length; i++) {
            if (node.child[i] != null) {
                clearHit(node.child[i]);
            }
        }
    }
}