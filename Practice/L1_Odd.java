import java.lang.reflect.AnnotatedArrayType;

public class Odd {
    public String solution(String s) {
        String answer[] = s.split(" ");
        String ANSWER = new String("");
        int tmp;
        for (int i = 0; i < answer.length; i++) {

            for (int k = 0; k < answer[i].length(); k++) {
              tmp =  (int) answer[i].charAt(k);
                if(k==0&& (tmp >= 97 && tmp <= 122)) ANSWER += (char)(tmp - 32);

                else if (k % 2 != 0 && (tmp >= 65 && tmp <= 90)) {
                    ANSWER +=(char)(tmp+32);
                }
                else if (k % 2 == 0 && (tmp >= 97 && tmp <=122)) {
                    ANSWER += (char)(tmp-32);
                }
                else ANSWER += answer[i].charAt(k);
            }
            if(i<answer.length-1) ANSWER += " ";
        }
        return ANSWER;
    }
}

class oodd{
    public static void main(String[] args) {
        Odd odd = new Odd();
        String s = "try hello world";
        String a = "tr a world";
        String d = "i'm hello world hungry";
        System.out.println(odd.solution(s));
        System.out.println(odd.solution(a));
        System.out.println(odd.solution(d));

    }
}
