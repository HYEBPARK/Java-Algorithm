//https://velog.io/@hye_b/ProgrammersJava-%ED%82%A4%ED%8C%A8%EB%93%9C-%EB%88%84%EB%A5%B4%EA%B8%B0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(int[] numbers, String hand) {
     	    String answer = "";
            //좌표로 거리를 구할거라서 키패드 번호[index] = 좌표 설정
            // 배열의 마지막 두 값은 초기값 *와 #의 좌표 
            int a[][]={{0,1},{3,0},{3,1},{3,2},{2,0},{2,1},{2,2},{1,0},{1,1},{1,2},{0,0},{0,2}};
            // 손의 위치를 리스트에 담아줌
            List<Character> list = new ArrayList<>();
            // 왼손과 오른손의 위치 초기화
            // 왼손에서의 거리, 오른손에서의 거리 초기화
            int Left =10, Right=11, leftmove =0 , rightmove =0;
            for(int i=0;i<numbers.length;i++){
                //1,4,7은 왼손으로만 가능
                if(numbers[i]==1||numbers[i]==4||numbers[i]==7) list.add('L');
                //3,6,9는 오른손으로만 가능
                else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) list.add('R');
                // 제외한 모든 경우의 수 
                else{
		    //왼손의 이동경로
                    leftmove = Math.abs(a[Left][0]-a[numbers[i]][0])+Math.abs(a[Left][1]-a[numbers[i]][1]);
                    //오른손의 이동경로
                    rightmove = Math.abs(a[Right][0]-a[numbers[i]][0])+Math.abs(a[Right][1]-a[numbers[i]][1]);
                    
                    if(i==0) {
                        list.add(Character.toUpperCase(hand.charAt(0)));
                    }
                    else {
                        // 거리 비교
                        if (leftmove > rightmove) list.add('R');
                        else if (leftmove < rightmove) list.add('L');
                        else list.add(Character.toUpperCase(hand.charAt(0)));
                    }
                }
		 //왼손과 오른손의 위치 저장
                if(list.get(i)=='L') Left=numbers[i];
                else Right=numbers[i];
               
            }
            
            for(int i=0;i<list.size();i++){
                answer+=list.get(i);
            }
            return answer;
    }
}
