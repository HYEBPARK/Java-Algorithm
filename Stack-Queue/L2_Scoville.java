import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
    
        int answer = 1;
        // 우선순위큐 사용 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i : scoville) {
            pq.add(i);
        }
        
        heap.add(pq.poll() + pq.poll() * 2);
        
        while (true) {
            
            if (pq.peek() >= K) break; // 제일 작은 값이 K와 크거나 같을 경우 break;
            
            // 모든 스코빌 지수가 K 보다 작을 경우 answer = -1;
            else if (pq.peek()<K && pq.size() < 2) {
                answer = -1;
                break;
            }
            answer++;
            pq.add(pq.poll() + pq.poll() * 2);
        }

        return answer;
    }
}
