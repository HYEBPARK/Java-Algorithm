public class L1_GymSuit {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        for(int i = 0;i<lost.length;i++){
            for(int k = 0; k<reserve.length;k++){
                if(lost[i]==reserve[k]){
                    answer++;
                    lost[i] = 0;
                    reserve[k] = 0;
                    break;
                }
            }
        }
        n-=(answer+(lost.length-answer));
        for(int i =0; i<lost.length; i++){
            for(int k =0;k<reserve.length;k++){
                if(reserve[k]!=0&&lost[i]==reserve[k]-1){
                    answer++;
                    reserve[k] = 0;
                    lost[i] = 0;
                    break;
                }
                else if(reserve[k]!=0&&lost[i]==reserve[k]+1){
                    answer++;
                    reserve[k] = 0;
                    lost[i] = 0;
                    break;
                }

            }
        }
        answer +=n;
        return answer;
 
    }

    public static void main(String[] args) {
        int a[] ={1,2};
        int b[] ={2,3,4};
        int n= 5;
        System.out.println(solution(n,a,b));
    }
} 
