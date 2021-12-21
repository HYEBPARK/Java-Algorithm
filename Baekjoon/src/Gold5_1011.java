import java.util.Scanner;

public class Gold5_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int scope[] = new int[N];
        int x, y;
        for (int i =0; i<N ; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            scope[i] = y - x;
        }

    }
}
