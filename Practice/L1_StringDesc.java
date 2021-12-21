import java.util.Arrays;
import java.util.Collections;

public class L1_StringDesc {
    public static String solution(String s) {
        String answer = "";
        Character[] arr = new Character[s.length()];
        for(int i =0;i <s.length();i++){
          arr[i]=s.charAt(i);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i =0;i<arr.length;i++){
            answer+=arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String a = "Zbcdefg";
        System.out.println(solution(a));
    }
}
