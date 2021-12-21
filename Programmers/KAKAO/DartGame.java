//군데군데 실수한 부분 때문에 오래걸렸다.
//점수의 범위를 0~9까지로 생각해서 10을 생각하지 못했었다.
// * 기호가 전의 점수까지 2배를 하기때문에 이전의 점수를 잘 저장해줬어야했다. 
// 어려운 알고리즘을 사용한것이 아니라 쉽지만 생각을 잘 했어야했다.

public class DartGame {
    public static int solution(String dartResult) {
        int answer = 0;
        int score = 0;
        int Befo_Score = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char string = dartResult.charAt(i); //다트 결과중 문자 하나
            //숫자만 있는 부분
            if (string > 47 && string < 58) {
                score = dartResult.charAt(i) - 48;
                if ((dartResult.charAt(i + 1) - 48 == 0) || (i > 0 && dartResult.charAt(i - 1) - 48 == 1)) {
                    score = 10;
                }
            } 
          //영어와 기호부분
          else if (string > 65) {
  
                if (string == 'D') {
                    score *= score;
                } else if (string == 'T') {
                    score = score * score * score;
                }

                // 기호나오는 부분
                if (i + 1 < dartResult.length() && dartResult.charAt(i + 1) < 47) {
                    if (dartResult.charAt(i + 1) == '*') {
                        answer -= Befo_Score;
                        answer += Befo_Score * 2 + score * 2;
                        Befo_Score = score * 2;

                    } else if (dartResult.charAt(i + 1) == '#') {
                        answer -= score;
                        Befo_Score = (-score);
                    }

                } 
            //기호가 없는 부분 
            else {
                    answer += score;
                    Befo_Score = score;
                }
            }
        }
        return answer;
    }
}

class DG{
    public static void main(String[] args) {
        String a = "1D2S#10S";
        System.out.println(DartGame.solution(a));
    }
}
