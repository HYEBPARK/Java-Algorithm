import java.util.Scanner;

public class While_10952 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==0 && b==0) break;
            System.out.println(a+b);
        }

    }
}
