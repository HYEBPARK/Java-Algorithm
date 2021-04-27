import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1_ArrayDivisor {
    public static int[] solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor==0) list.add(arr[i]);
        }
        int []answer = new int[list.size()];
        if(list.isEmpty()) return new int[] {-1};
        else{
            for(int i =0; i<list.size();i++){
                answer[i]=list.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }




    public static void main(String[] args) {
        int arr1[] = {5,9,7,10};
        int arr2[] = {2,36,1,3};
        int arr3[] = {3,2,6};
        System.out.println(solution(arr1,5));
        System.out.println(solution(arr1,1));
        System.out.println(solution(arr1,10));
    }
}
