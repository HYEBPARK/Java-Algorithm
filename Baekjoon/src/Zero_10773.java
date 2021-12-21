import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero_10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for(int i = 0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0) s.push(num);
            else s.pop();
        }
        for(int i : s) sum += i;
        System.out.println(sum);
    }
}
