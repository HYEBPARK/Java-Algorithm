import java.util.Arrays;

public class L1_StringSort {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        int cnt = strings.length;
        while(cnt != 0){
            for(int i = 0; i<strings.length-1;i++){
                String tmp = strings[i];
                if(tmp.charAt(n)>strings[i+1].charAt(n)){
                    strings[i] = strings[i+1];
                    strings[i+1] = tmp;
                }
            }
            cnt --;
        }

        return strings;

    }

    public static void main(String[] args) {
        String a[] = {"abce", "abcd", "cdx"};
        System.out.println(solution(a,1));
    }
}
