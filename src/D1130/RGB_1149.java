package D1130;

import java.util.Scanner;

public class RGB_1149{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int arr[][] = new int[N][3];
        int cost[][] = new int[N][3];
        for(int i = 0 ; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        cost[0][0] = arr[0][0];
        cost[0][1] = arr[0][1];
        cost[0][2] = arr[0][2];

        for(int i = 1 ; i<N; i++){
            cost[i][0] += arr[i][0]+Math.min(cost[i-1][1],cost[i-1][2]);
            cost[i][1] += arr[i][1]+Math.min(cost[i-1][0],cost[i-1][2]);
            cost[i][2] += arr[i][2]+Math.min(cost[i-1][1],cost[i-1][0]);
        }
        int min = cost[arr.length-1][0];
        for(int i = 0 ; i<3; i++){
            if(cost[arr.length-1][i] < min) min = cost[arr.length-1][i];
        }
        System.out.println(min);
    }
}
