import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class set_1717 {
    static int n, m;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        for(int i = 0; i<=n; i++) arr[i] = i;
        for (int i = 1; i <= m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st1.nextToken());
            int num1 = Integer.parseInt(st1.nextToken());
            int num2 = Integer.parseInt(st1.nextToken());
            if (check == 0) {
                union(num1,num2);
            } else {
             if(find(num1) == find(num2)) sb.append("YES").append("\n");
             else sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }

    private static int find(int i) {
        if(arr[i] == i) return i;
        else return arr[i] = find(arr[i]);
    }

    private static void union(int num1, int num2) {
        int a = find(num1);
        int b = find(num2);
        arr[a] = b;
    }
}
