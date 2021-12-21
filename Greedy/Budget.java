// 오름차순 배열 후 작은 수 부터 뺐다.
// Greedy  


import java.util.Arrays;

public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i =0;i<d.length;i++){
            if(budget-d[i]>=0) {
                budget-=d[i];
                answer++;
            }
        }
        return answer;
    }
}

class Budget_{
    public static void main(String[] args) {
        int d[] ={1,3,2,5,4};
        int b = 9;
        System.out.println(Budget.solution(d,b));

    }
}
