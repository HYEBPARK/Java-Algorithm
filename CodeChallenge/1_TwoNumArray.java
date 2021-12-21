//HashSet에 대해서 공부하기 

import java.util.*;

public class TwoNumArray {
    public static int[] solution(int[] numbers) {

        HashSet<Integer> Sum = new HashSet<>();
        for(int i =0;i<numbers.length;i++){
            for(int k =i+1; k<numbers.length;k++){
                Sum.add(numbers[i]+numbers[k]);
            }
        }
        int answer[]=new int[Sum.size()];
        Iterator<Integer> it = Sum.iterator();
        for(int i =0;i<Sum.size();i++){
            answer[i]=it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}

class TNA{
    public static void main(String[] args) {
        int numbers[]={2,1,3,4,1};
        System.out.println(TwoNumArray.solution(numbers));
    }
}
