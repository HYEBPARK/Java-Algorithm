public class L1_PrimeNum {
    public static int solution(int n) {
        int answer = 0;
        int num[] = new int[n+1];
        for(int i = 2; i<=n; i++){
            num[i] = i;

        }
        for(int i =2;i<n; i++){
            if(num[i]==0) continue;
            for(int j =2*i;j<=n; j+=i){
                num[j] = 0;
            }
        }

        for(int i = 2 ; i<num.length; i ++){

            if(num[i]!=0) answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));

    }
}