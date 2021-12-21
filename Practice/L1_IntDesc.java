import java.util.Arrays;

public class L1_IntDesc {
    public long solution(long n) {
        String a = n+" ";
        char ch[] = new char[a.length()];
        for (int i =0; i<ch.length;i++){
            ch[i] = a.charAt(i);
        }
        Arrays.sort(ch);
        String b=" ";
        for(int i = ch.length;i>=0 ;i--){
            b+=ch[i];
        }
        long answer = Long.parseLong(b);
        return answer;

    }

}
