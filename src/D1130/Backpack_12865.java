package D1130;

import java.util.Scanner;
import java.util.TreeMap;

public class Backpack_12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        for(int i = 0 ; i<N; i++){
            int w = sc.nextInt();
            int v = sc.nextInt();

            if(tree.containsKey(w) && tree.get(w) > v) continue;
            else tree.put(w,v);
        }

    }
}
