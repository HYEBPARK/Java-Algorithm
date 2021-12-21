import java.util.Scanner;

public class While_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean same = false;
        int cnt = 0;
        int num1 = N;
        int num2;
        while(same == false){
            cnt++;
            if(num1>9){
                num2 = (num1%10) + (num1/10);
            }

            else num2 = num1;

            num1 = (num1%10)*10 + num2%10;
            if(num1==N) same = true;
        }
        System.out.println(cnt);
    }
}
