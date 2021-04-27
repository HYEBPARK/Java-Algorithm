class Solution {
    boolean solution(String s) {
        boolean answer = true;
         int tmp;
        int pcount =0;
        int ycount =0;
           for(int i=0;i<s.length();i++){
               tmp=s.charAt(i);
               if(tmp==80 || tmp==112) pcount++;
               else if(tmp==89 || tmp==121) ycount++;
           }
           
           if(pcount!=ycount) answer=false;

            return answer;
    }
}
