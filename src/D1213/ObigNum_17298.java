package D1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class ObigNum_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
        Stack<Integer> s = new Stack<>();
        int answer[] = new int[N+1];
        for(int i = N; i>0; i--){
            while (!s.isEmpty() && s.peek()<=arr[i]) s.pop();
            if(s.isEmpty()) answer[i] = -1;
            else answer[i] = s.peek();

            s.push(arr[i]);
        }
        for(int i = 1; i<=N; i++) sb.append(answer[i]+" ");
        System.out.println(sb);
    }
}
