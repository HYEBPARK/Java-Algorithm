

public class L1_GCDnLCM {
    static int[] solution(int n, int m) {

        int gcd = GCD(n, m);
        int lcm = n/gcd*m/gcd*gcd;
        int answer[]={gcd , lcm};

            return answer;
        }
        static int GCD(int a,int b){
            int r = 0;
            while(b!=0){
                r = a%b;
                a=b;
                b=r;
        }
            return a;
        }
    public static void main(String[] args) {
        System.out.println(solution(3,12));
        System.out.println(solution(12,84));
    }
}
