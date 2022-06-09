import java.util.Scanner;

public class P_15961 {
	static int plate, allType, eventPlate, couponNumber;
	static int[] sushi;
	static int[] selected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		plate = sc.nextInt();
		allType = sc.nextInt();
		eventPlate = sc.nextInt();
		couponNumber = sc.nextInt();
		sushi = new int[plate];
		selected = new int[allType + 1];

		for (int i = 0; i < plate; i++) {
			sushi[i] = sc.nextInt();
		}
		System.out.println(MaxTypeCount());
	}

	private static int MaxTypeCount() {
		int total = 0;

		for (int i = 0; i < eventPlate; i++) {
			if (selected[sushi[i]] == 0)
				total++;
			selected[sushi[i]]++;
		}

		int maxCnt = total;

		for (int i = 1; i < plate; i++) {
			int frontPlate = sushi[i - 1];
			selected[frontPlate]--;

			if (selected[frontPlate] == 0) {
				total--;
			}

			int endIndex = (i + eventPlate - 1) % plate;

			if (selected[sushi[endIndex]] == 0)
				total++;
                
			selected[sushi[endIndex]]++;

			if (maxCnt <= total) {
				if (selected[couponNumber] == 0)
					maxCnt = total + 1;
				else
					maxCnt = total;
			}
		}
		return maxCnt;
	}
}
