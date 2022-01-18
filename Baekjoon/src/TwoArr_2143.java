package D0114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TwoArr_2143 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());
        Long []arrA = new Long[n];
        List<Long> subA = new ArrayList<>();
        StringTokenizer a = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<n; i++) {
            arrA[i] = Long.parseLong(a.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        Long []arrB = new Long[Math.toIntExact(m)];
        List<Long> subB = new ArrayList<>();
        StringTokenizer b = new StringTokenizer(br.readLine());
        for (int i = 0 ; i<m; i++) {
            arrB[i] = Long.parseLong(b.nextToken());
        }
        for(int k = 0; k<n; k++) {
            subA.add(arrA[k]);
            for (int i = k+1; i < n; i++) {
                subA.add(subA.get(subA.size()-1) + arrA[i]);
            }
        }
        Collections.sort(subA);
        for(int k = 0; k<m; k++) {
            subB.add(arrB[k]);
            for (int i = k+1; i < m; i++) {
                subB.add(subB.get(subB.size()-1) + arrB[i]);
            }
        }
        Collections.sort(subB, Comparator.reverseOrder());

        int pointA = 0;
        int pointB = 0;
        long result = 0;
        while (pointA<subA.size() && pointB<subB.size()){
            long curA = subA.get(pointA);
            long Target = T-curA;
            if(subB.get(pointB) == Target){
                long countA = 0;
                long countB = 0;
                while (pointA < subA.size()&& subA.get(pointA) == curA  ) {
                    countA++;
                    pointA++;
                }
                while (pointB < subB.size() && subB.get(pointB) == Target){
                    countB++;
                    pointB++;
                }
                result += countA * countB;
            }
            else if(subB.get(pointB) > Target){
                pointB++;
            }
            else{
                pointA++;
            }
        }
        System.out.println(result);
    }
}
