import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Build_7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][3];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = 1;
        }
        for (int i = 0; i < N; i++) {
            int max1 = arr[i][0];
            int max2 = arr[i][1];
            for (int k = 0; k < N; k++) {
                if (max1 < arr[k][0] && max2 < arr[k][1]) arr[i][2]++;
            }
            sb.append(arr[i][2] + " ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
