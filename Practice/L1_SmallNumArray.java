import java.util.ArrayList;
import java.util.List;

public class L1_SmallNumArray {
    public static int[] solution(int[] arr) {

        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]) min = arr[i];
        }
        List<Integer> list = new ArrayList<>();
        if(arr.length==1) list.add(-1);
        else{
            for(int i =0;i<arr.length;i++){
                if(min != arr[i]) list.add(arr[i]);
            }
        }
        int answer[]=new int[list.size()];
        for(int i =0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(solution(a));
    }
}
