import java.util.Scanner;

public class For_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum[] = new int[a];
        int num[][] = new int[a][a];
        for(int i = 0; i < a ; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            num[i][0] = b;
            num[i][1] = c;
            sum[i] = b+c;
        }

        for (int i=0; i<sum.length; i++) System.out.println("Case #"+(i+1)+": "+num[i][0] +" + " +num[i][1]+" = "+sum[i] );
    }
}
