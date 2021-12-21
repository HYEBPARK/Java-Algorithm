import java.util.Scanner;

public class fibo_10870 {
    static int dp[];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        System.out.println(fibo(n));

    }

    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(dp[n]!=0) return dp[n];
        else dp[n] = fibo(n-1) + fibo(n-2);
        return dp[n];
    }
}
