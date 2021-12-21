package D1121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class FindNum_1920 {
    static int arr[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        String s= br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M; i++) {
            int num = Integer.parseInt(st1.nextToken());
            if(find(num)==false) sb.append(0).append("\n");
            else sb.append(1).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static boolean find(int N){
        int left = 0, right = arr.length-1;
        if(N > arr[arr.length-1]) return false;
        while (left <= right){
            int mid = (left+right)/2;
            if(arr[mid]<N) left = mid+1;
            else if(arr[mid]>N) right = mid-1;
            else return true;
        }

        return false;
    }
}

