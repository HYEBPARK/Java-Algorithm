import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i<nums.length;i++){
            hs.add(nums[i]); // 중복된 종류 제외 
        }
        if(hs.size()> nums.length/2) answer = nums.length/2;
        else answer=hs.size(); // 모든 종류의 수가 num.length/2 보다 작으면
        return answer;
    }
}
