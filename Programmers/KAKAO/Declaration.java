//리팩토링 예정

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class  {
	public static int[] solution(String[] id_list, String[] report, int k) {
		Map<String, HashSet<String>> reportBoard = new LinkedHashMap<>();
		Map<String, Integer> notice = new LinkedHashMap<>();

		for (String id : id_list) {
			reportBoard.put(id, new HashSet<>());
			notice.put(id, 0);
		}

		for (String record : report) {
			String[] split = record.split(" ");
			String reporter = split[0];
			String user = split[1];

			reportBoard.get(user).add(reporter);
		}

		reportBoard.values().stream().filter(set -> set.size() / k > 0)
			.forEach(set ->
				set.forEach(user ->
					notice.put(user, notice.get(user) + 1)));

		return notice.values().stream().mapToInt(cnt -> cnt).toArray();
	}
}
