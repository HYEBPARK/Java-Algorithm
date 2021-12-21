import java.util.Scanner;

public class Array_2562{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, cnt = 0, num = 0;
        for(int i =0; i<9; i++){
            num = sc.nextInt();
            if(num > max) {
                max = num;
                cnt = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);

    }
}
