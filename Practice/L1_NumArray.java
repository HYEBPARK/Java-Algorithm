import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class L1_NumArray {
    public static int[] solution(long n) {
        String str = ""+n;
        int answer[] = new int[str.length()];
        for(int i =0;i<str.length();i++){
            answer[i]=(int) (n%10);
            n/=10;
        }
        return answer;



    }

    public static void main(String[] args) {
        System.out.println(solution(123423));
        System.out.println(solution(234215));
    }
}
