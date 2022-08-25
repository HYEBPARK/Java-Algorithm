import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

class Solution {
   public static String solution(String[] survey, int[] choices) {
		Map<String, Integer> score = new ConcurrentHashMap<>();
		score.put("R", 0);
		score.put("T", 0);
		score.put("F", 0);
		score.put("C", 0);
		score.put("M", 0);
		score.put("J", 0);
		score.put("A", 0);
		score.put("N", 0);

		for (int i = 0; i < survey.length; i++) {
			String category1 = survey[i].substring(0, 1);
			String category2 = survey[i].substring(1, 2);

			if (choices[i] == 4)
				continue;
			else if (choices[i] > 4) {
				score.put(category2, score.get(category2) + (choices[i] - 4));
			} else {
				score.put(category1, score.get(category1) + (4 - choices[i]));
			}
		}
		StringBuilder answer = new StringBuilder();

		answer.append(isSameScore(score.get("R"), score.get("T")) ? "R" : highScore(score, "R", "T"));
		answer.append(isSameScore(score.get("F"), score.get("C")) ? "C" : highScore(score, "F", "C"));
		answer.append(isSameScore(score.get("M"), score.get("J")) ? "J" : highScore(score, "M", "J"));
		answer.append(isSameScore(score.get("A"), score.get("N")) ? "A" : highScore(score, "A", "N"));

		return answer.toString();
	}

	private static boolean isSameScore(Integer score1, Integer score2) {
		return Objects.equals(score1, score2);
	}

	private static String highScore(Map<String, Integer> score, String category1, String category2) {
		if (score.get(category1) > score.get(category2))
			return category1;
		return category2;
	}
}
