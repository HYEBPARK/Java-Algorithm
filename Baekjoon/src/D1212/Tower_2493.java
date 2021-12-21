package D1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Tower_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        StringBuilder sb = new StringBuilder();
        sb.append(0).append(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
        Stack<Integer> s = new Stack<>();
        s.push(1);
        for (int i = 2; i <= N; i++) {
            boolean b = i < N && arr[i] > arr[i + 1];
            if (arr[s.peek()] > arr[i]) {
                sb.append(s.peek()).append(" ");
                if (b) s.push(i);
            } else {
                while (!s.isEmpty()) {
                    if (arr[s.peek()] > arr[i]) {
                        sb.append(s.peek()).append(" ");
                        if (b) s.push(i);
                        break;
                    }
                    s.pop();
                }
                if (s.isEmpty()) {
                    s.push(i);
                    sb.append(0).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}
