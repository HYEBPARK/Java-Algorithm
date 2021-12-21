import java.util.Scanner;

public class Mul_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int first = a * (b%10);
        int second = a * (b%100-b%10);
        int third = a * (b-b%100);
        int result = first+second+third;

        System.out.println(first);
        System.out.println(second/10);
        System.out.println(third/100);
        System.out.println(result);

    }
}
