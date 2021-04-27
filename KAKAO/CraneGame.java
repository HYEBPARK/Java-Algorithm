//바구니에 1개가 있을때 중복되는 경우를 생각하지 못했었다

import java.util.Stack;

public class CraneGame {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for(int k = 0;k< moves.length;k++) {
            for(int i = 0; i< board.length;i++){
                if(board[i][moves[k]-1]>0) {
                    
                   // basket.size()>=1 이부분을 다시 생각해서 고쳤다. 
                    if(basket.size()>=1 && basket.peek() == board[i][moves[k]-1]) {
                        basket.pop();
                        answer+=2;
                    }
                    else basket.push(board[i][moves[k]-1]);

                    board[i][moves[k]-1] = 0;
                    break;
                }

            }
        }
        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        int [][]b = {{0,0,1,0,0},{0,0,1,0,0},{0,2,1,0,0},{0,2,1,0,0},{0,2,1,0,0}};
        int []m={1,2,3,3,2,3,1};
        System.out.println(CraneGame.solution(b,m));
    }
}
