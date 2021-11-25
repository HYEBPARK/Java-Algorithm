import java.util.Scanner;

public class Tree_2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long tree[] = new long[N];
        long max = 0;
        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();
            if (tree[i] > max) max = tree[i];
        }
        long left = 0, right = max, mid, height = 0;
        boolean flag = false;
        while (left <= right) {
            long sum = 0;
            mid = (left + right) / 2;
            for (int i = 0; i < tree.length; i++) {
                if (tree[i] > mid) sum += tree[i] - mid;
                else continue;
            }
            if (sum == K) {
                System.out.println(mid);
                flag = true;
                break;
            } else if (sum < K) right = mid - 1;
            else {
                left = mid + 1;
                height = mid;
            }
        }
        if (!flag) System.out.println(height);
    }
}
