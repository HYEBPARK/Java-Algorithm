public class L1_Sqrt {
    public static long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n);
        if(x%1<1) answer = -1;
        else {
            x+=1;
            answer= (long)(x*x);
        }
        return answer;
    }

    public static void main(String[] args) {
        long a= 3;
        System.out.println(solution(3));
    }
}
