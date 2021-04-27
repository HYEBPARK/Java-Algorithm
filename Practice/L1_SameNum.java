import java.util.ArrayList;
import java.util.List;

public class L1_SameNum {
    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int current = 10 ;
        for(int i =0; i<arr.length;i++){
            if(arr[i] != current){
                list.add(arr[i]);
                current=arr[i];
            }
        }
        int answer[] = new int[list.size()];
        for(int i =0;i<list.size();i++){
            answer[i] = list.get(i);
        }


        return answer;
    }


    public static void main(String[] args) {
        int arr1[] = {1,1,3,3,0,1,1};
        int arr2[] = {4,4,4,3,3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
