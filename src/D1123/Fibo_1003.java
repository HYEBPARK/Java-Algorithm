package D1123;

import java.util.Scanner;
public class Fibo_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[41];
        arr[0] = 0;
        arr[1] = 1;
        for (int k = 2; k < 41; k++) arr[k] = arr[k - 2] + arr[k - 1];
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num == 0) sb.append("1 0").append("\n");
            else sb.append(arr[num - 1]).append(" ").append(arr[num]).append("\n");
        }
        System.out.println(sb);
    }
}
