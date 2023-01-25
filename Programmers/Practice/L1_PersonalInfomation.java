// https://school.programmers.co.kr/learn/courses/30/lessons/150370

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class L1_PersonalInfomation {
	public class Terms {
		private String name;
		private int validity;

		public Terms(String name, int validity) {
			this.name = name;
			this.validity = validity;
		}

		public String getName() {
			return name;
		}

		public int getValidity() {
			return validity;
		}
	}

	public class Privacy {
		private LocalDate collectionDate;
		private Terms terms;

		public Privacy(LocalDate collectionDate, Terms terms) {
			this.collectionDate = collectionDate;
			this.terms = terms;
		}

		public LocalDate getCollectionDate() {
			return collectionDate;
		}

		public Terms getTerms() {
			return terms;
		}
	}

	public int[] solution(String today, String[] terms, String[] privacies) {
		// today = YYYY.MM.DD
		// terms = 약관종류(A~Z) 유효기간(1~100)
		// pricacies = {"YYYY.MM.DD A~Z"}
		LocalDate todayDate = getLocalDate(today);

		Map<String, Terms> termsMap = Arrays.stream(terms).map(t -> {
			String[] termsSplitBySpace = t.split(" ");

			return new Terms(termsSplitBySpace[0], Integer.parseInt(termsSplitBySpace[1]));
		}).collect(Collectors.toMap(Terms::getName, t -> t));

		List<Privacy> privacyList = Arrays.stream(privacies).map(privacy -> {
			String[] privacySplitBySpace = privacy.split(" ");

			return new Privacy(getLocalDate(privacySplitBySpace[0]), termsMap.get(privacySplitBySpace[1]));
		}).toList();

		String[] destructionList = getDestructionList(todayDate, privacyList);

		return Arrays.stream(destructionList).mapToInt(Integer::parseInt).toArray();
	}

	private String[] getDestructionList(LocalDate todayDate, List<Privacy> privacyList) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < privacyList.size(); i++) {
			Privacy privacy = privacyList.get(i);
			LocalDate destructionDate = privacy.getCollectionDate()
				.plusMonths(privacy.getTerms().getValidity())
				.minusDays(1);

			if (destructionDate.getDayOfMonth() > 28) {
				destructionDate = LocalDate.of(destructionDate.getYear(), destructionDate.getMonth(), 28);
			}

			if (destructionDate.isBefore(todayDate)) {
				stringBuilder.append(i + 1).append(" ");
			}
		}

		return stringBuilder.toString().split(" ");
	}

	private LocalDate getLocalDate(String date) {
		date = date.replace(".", "");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");

		return LocalDate.parse(date, format);
	}
}
