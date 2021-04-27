public class L1_Collatz {
    public static int solution(int num) {
        int answer = 0;
        long a= (long) num;
        while(answer<=500){
            if(a%2==0) {
                a= a/2;
                answer++;
            }
            else if(a!=1&&a%2!=0){
                a=a*3+1;
                answer++;
            }
            else break;
        }
        if(answer>500) answer=-1;
        return answer;
    }

    public static void main(String[] args) {
        int a = 626331;
        System.out.println(solution(a));
    }
}
