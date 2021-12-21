package D1130;

import java.util.Scanner;

public class OneTwoThree_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[] = new int[11];
        num[1] = 1;
        num[2] = 2;
        num[3] = 4;
        for(int i = 4 ; i<num.length; i++)num[i] = num[i-1]+num[i-2]+num[i-3];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++) sb.append(num[sc.nextInt()]).append("\n");
        System.out.println(sb);
    }
}
