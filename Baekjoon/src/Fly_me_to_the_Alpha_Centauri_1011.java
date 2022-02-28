import java.util.Scanner;

public class Flyme_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long start = sc.nextLong();
            long end = sc.nextLong();
            long cnt = 0, cur = 0;
            long distance = end - start;

            while (distance != 0 && distance > (end - start) /2) {
                if(distance - (cur + 1) >= (end - start) / 2)
                {
                    distance = distance - (cur + 1);
                    cur = cur + 1;
                }
                else
                    break;
                cnt++;
            }
            if(distance > (end - start) /2)
                cnt += cnt +1;
            else if((end-start)/2 >= 1 && distance <= (end - start) /2)
                cnt += cnt;

            sb.append(cnt);
            if(i < T-1)
                sb.append("\n");
        }
        System.out.println(sb);
    }
}
