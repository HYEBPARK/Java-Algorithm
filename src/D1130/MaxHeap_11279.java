package D1130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeap_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num>0) pq.add(num);
            else if(!pq.isEmpty()) sb.append(pq.poll()).append("\n");
            else sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
}
