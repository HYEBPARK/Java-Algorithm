class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        int  cnt=0;
		for(int i=0;i<prices.length;i++) {
			for(int k=i+1;k<prices.length;k++) {
				if(prices[i]>prices[k]) {
					cnt++;
					break; 
				}
				
				else cnt++;
			}
			prices[i] = cnt;
			cnt=0;
		}
		answer=prices;
		answer[prices.length-1]=0;
        
        return answer;
    }
}
