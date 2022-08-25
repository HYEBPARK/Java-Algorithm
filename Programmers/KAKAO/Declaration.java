import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class  {
	public static int[] solution(String[] id_list, String[] report, int k) {
			Map<String, HashSet<String>> reportedBoard = new LinkedHashMap<>();
		Map<String, Integer> reportedCount = new LinkedHashMap<>();

		for (String id : id_list) {
			reportedBoard.put(id, new HashSet<>());
			reportedCount.put(id, 0);
		}

		for (String reportRecord : report) {
			String[] split = reportRecord.split(" ");
			String reporter = split[0];
			String user = split[1];

			reportedBoard.get(user).add(reporter);
		}

		reportedBoard.values().stream()
			.filter(reporters -> reporters.size() / k > 0)
			.forEach(overReportedUsers ->
				overReportedUsers.forEach(overReportedUser ->
					reportedCount.put(overReportedUser, reportedCount.get(overReportedUser) + 1)));

		return reportedCount.values().stream().mapToInt(cnt -> cnt).toArray();
	}
}
