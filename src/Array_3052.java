import java.util.HashSet;
import java.util.Scanner;

public class Array_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A , Remainder;
        HashSet<Integer> num = new HashSet<>();
        for (int i =0; i<10 ; i++){
            A = sc.nextInt();
            Remainder = A % 42;
            num.add(Remainder);
        }

        System.out.println(num.size());
    }
}
