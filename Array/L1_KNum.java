import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length];
        for(int k =0;k<commands.length;k++) {
            int tmp[] = Arrays.copyOfRange(array,commands[k][0]-1,commands[k][1]);
            Arrays.sort(tmp);
            answer[k] = tmp[commands[k][2]-1];
        }
        return answer;
    }
}

class k{
  public static void main(String[] args){
    Solution solution = new Solution();
    int array[]={1,5,6,7,2,4}
    int commands[][]={{2,3,1},{3,4,2},{1,5,3}};
    System.out.println(solution.Solution(array,commands));
    }
}    
    
