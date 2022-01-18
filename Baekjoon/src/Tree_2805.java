package D0114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tree_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int []tree = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int max = 0, height = 0;
        for(int i = 0 ; i<N; i++){
            tree[i] = Integer.parseInt(st1.nextToken());
            if(max < tree[i]) max = tree[i];
        }
        boolean flag = false;
        int left = 0, right= max, mid, result = 0;
        while (left <= right){
            int sum = 0;
            mid = (left + right) /2;
            for(int i = 0; i<tree.length;i++){
                if(tree[i] > mid) sum+=tree[i] - mid;
            }
            if(sum == M) {
                result = mid;
                flag = true;
                System.out.println(result);
                break;
            }
            else if(sum < M) right = mid -1;
            else {
                left = mid+1;
                height = mid;
            }
        }
        if(!flag) System.out.println(height);
    }
}
