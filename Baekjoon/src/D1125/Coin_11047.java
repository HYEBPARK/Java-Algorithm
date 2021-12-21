package D1125;

import java.util.Scanner;

public class Coin_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;

        while (K > 0) {
            for(int i = arr.length-1; i>=0 ; i--){
                if(K/arr[i] > 0) {
                    cnt += (K/arr[i]);
                    K -= arr[i]*(K/arr[i]);
                }
            }
        }
        System.out.println(cnt);

    }
}
