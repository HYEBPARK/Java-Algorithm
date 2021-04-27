class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            for(int i=b;i<=a;i++){
                answer += i;
            }
        }
        else if(b>a){
            for(int k=a;k<=b;k++){
                answer+=k;
            }
        }
        else answer+=a;
        
        return answer;
       }
}
