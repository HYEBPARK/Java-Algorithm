package D1127;

import java.util.Arrays;
import java.util.Scanner;

public class Coordinate_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int map[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            map[i][0] = sc.nextInt();
            map[i][1] = sc.nextInt();
        }
        Arrays.sort(map, (o1, o2) -> {
            if (o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            else return Integer.compare(o1[0], o2[0]);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map[i][0]).append(" ");
            sb.append(map[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
