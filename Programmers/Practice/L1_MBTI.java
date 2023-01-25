// https://school.programmers.co.kr/learn/courses/30/lessons/118666

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class L1_MBTI {
	public class Indicators {
		private final String firstType;
		private final String secondType;
		private int firstScore;
		private int secondScore;

		public Indicators(String firstType, String secondType) {
			this.firstType = firstType;
			this.secondType = secondType;
		}

		public void addScore(int score) {
			if (score < 4) {
				this.firstScore += 4 - score;
			} else {
				this.secondScore += score - 4;
			}
		}

		public void addReverseScore(int score) {
			if (score < 4) {
				this.secondScore += 4 - score;
			} else {
				this.firstScore += score - 4;
			}
		}

		public String getIndicatorsName() {
			return firstType + secondType;
		}

		public String getHigherScoreType() {
			if (firstScore >= secondScore) {
				return firstType;
			} else {
				return secondType;
			}
		}
	}

	public String solution(String[] survey, int[] choices) {
		Indicators first = new Indicators("R", "T");
		Indicators second = new Indicators("C", "F");
		Indicators third = new Indicators("J", "M");
		Indicators fourth = new Indicators("A", "N");

		Map<String, Indicators> testStrip = makeTestStrip(first, second, third, fourth);
		for (int i = 0; i < survey.length; i++) {
			if (testStrip.containsKey(survey[i])) {
				testStrip.get(survey[i]).addScore(choices[i]);
			} else {
				String type = new StringBuffer(survey[i]).reverse().toString();
				testStrip.get(type).addReverseScore(choices[i]);
			}
		}

		StringBuilder PersonalityType = new StringBuilder();
		for (Map.Entry<String, Indicators> entry : testStrip.entrySet()) {
			PersonalityType.append(entry.getValue().getHigherScoreType());
		}

		return PersonalityType.toString();
	}

	private Map<String, Indicators> makeTestStrip(Indicators... indicators) {
		Map<String, Indicators> testStrip = new ConcurrentHashMap<>();

		for (Indicators i : indicators) {
			testStrip.put(i.getIndicatorsName(), i);
		}

		return testStrip;
	}
}
