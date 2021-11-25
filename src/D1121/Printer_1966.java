package D1121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Printer_1966 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N; i++){
            PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
            String s1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(s1);
            int print = Integer.parseInt(st1.nextToken());
            int peek = Integer.parseInt(st1.nextToken());
            String s = br.readLine();
            StringTokenizer st= new StringTokenizer(s);
            int a[] = new int[print];
            for(int k=0; k<print; k++){
                int num = Integer.parseInt(st.nextToken());
                pq.offer(num);
                a[k] = num;
            }
            int cnt = 0;
            while (!pq.isEmpty()){
                for(int k = 0; k<print; k++){
                    if(pq.peek() == a[k]){
                        pq.poll();
                        cnt++;
                        if(k==peek){
                            pq.clear();
                            break;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
