class Solution {
    public int solution(String skill, String[] skill_trees) {
      	int answer = 0;
        int cnt = 0;
        boolean a = false;
		
        // skill의 길이가 1일때는 모든 skill_trees가 가능하다.(중요) 
        if (skill.length() == 1) {
            answer += skill_trees.length;
        } 
        
        else {
            for (int i = 0; i < skill_trees.length; i++) {
                for (int k = 0; k < skill.length() - 1; k++) {
                
                    int index1 = skill_trees[i].indexOf(skill.charAt(k)); // 현재 skill의 위치
                    int index2 = skill_trees[i].indexOf(skill.charAt(k + 1)); // 다음 skill의 위치 
                    
                    // 앞의 스킬을 배우지 않고, 뒤의 스킬을 배울때 
                    if (index1 == -1 &&  index2 != -1) {
                        a = false;
                        break;
                    } 
                    
                    //앞의 스킬을 배우지만, 뒤의 스킬을 더 먼저 배울때
                    else if (index2 != -1 && index1 > index2) {
                        a = false;
                        break;
                    } 
                    
                    else a = true;
                }
                if (a == true) cnt++;
            }
            answer = cnt;
        }

        return answer;
    }
}
