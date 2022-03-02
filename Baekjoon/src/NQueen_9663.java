import java.util.Scanner;

public class NQueen_9663 {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cur = 0;
        if (N == 1)
            System.out.println(1);
        else if (N == 2 || N == 3)
            System.out.println(0);
        else {
            int arr[] = new int[N];
            solve(N, cur, arr);
            System.out.println(cnt);
        }
    }


    private static int valid_check(int []arr, int cur)
    {
        int i = 0;
        while(i < cur)
        {
            if(Math.abs(i - cur) == Math.abs(arr[i] - arr[cur]))
                return -1;
            if(arr[cur] == arr[i])
                return -1;
            i++;
        }
        return 1;
    }

    private static void solve(int n, int cur, int arr[]) {
        arr[cur] = 0;
        while (arr[cur] < n) {
            if (valid_check(arr, cur) == 1) {
                if (cur == n-1)
                    cnt++;
                else
                    solve(n, cur + 1, arr);
            }
            arr[cur]++;
        }
    }
}
