//https://school.programmers.co.kr/learn/courses/30/lessons/120956

import java.util.Arrays;
import java.util.List;

public class L0_Babbling {
	public class Baby {
		private final List<String> words;

		public Baby(List<String> words) {
			this.words = words;
		}

		public List<String> getWords() {
			return List.copyOf(words);
		}

		public boolean isBabbling(Baby baby, String word) {
			for (String babyWord : baby.words) {
				word = word.replace(babyWord, " ");
			}

			return word.isBlank();
		}
	}

	public int solution(String[] babbling) {
		Baby musseuk = new Baby(List.of("aya", "ye", "woo", "ma"));
		long answer = Arrays.stream(babbling).filter(bab -> musseuk.isBabbling(musseuk, bab)).count();

		return Math.toIntExact(answer);
	}
}
