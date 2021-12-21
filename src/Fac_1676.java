import java.util.Scanner;

public class Fac_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int cnt = 0;
        for(int i = 0; i<=N; i+=5){
            if(i>100 && i%125==0) cnt+=3;
            else if(i!=0 && i%25==0) cnt += 2;
            else if(i>=5) cnt += 1;
        }
        System.out.println(cnt);
    }
}
