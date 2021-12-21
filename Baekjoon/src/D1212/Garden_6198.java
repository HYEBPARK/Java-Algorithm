package D1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Garden_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N+1];
        Stack<Integer> s = new Stack<>();
        for(int i = 1; i<N+1; i++) arr[i] = Long.parseLong(br.readLine());
        s.push(N);
        Long gardenSum = 0L;
        for(int i = N-1; i>=1 ; i--){
            if(arr[s.peek()] >= arr[i]){
                gardenSum += s.peek()-i-1;
                if(arr[i] >= arr[i-1]) s.push(i);
            }
            else{
                while (!s.isEmpty()){
                    if(arr[s.peek()] >= arr[i]){
                        gardenSum += s.peek()-i-1;
                        if(arr[i] >= arr[i-1]) s.push(i);
                        break;
                    }
                    else s.pop();
                }
                if(s.isEmpty()){
                    s.push(i);
                    gardenSum += N - i;
                }
            }
        }
        System.out.println(gardenSum);
    }
}
