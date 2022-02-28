import java.util.Scanner;

public class Flyme_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long start = sc.nextLong();
            long end = sc.nextLong();
            long distance = end - start;
            long max = (long)Math.sqrt(distance);
            if (max == Math.sqrt(distance))
                sb.append((max * 2) - 1);
            else if(distance <= max * max + max)
                sb.append(max * 2);
            else
                sb.append((max * 2) + 1);
            if(i < T-1)
                sb.append("\n");
        }
        System.out.println(sb);
    }
}
