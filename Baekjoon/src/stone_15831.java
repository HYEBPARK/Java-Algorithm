import java.util.Scanner;

public class P_15831 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalStones = sc.nextInt();
		int maxBlackStone = sc.nextInt();
		int minWhiteStone = sc.nextInt();
		String line = sc.next();
		char[] stones = line.toCharArray();

		int start = 0, end = 0;
		int white = 0, black = 0;
		int curLen = 0, maxLen = 0;

		while (end < totalStones) {
			if (black > maxBlackStone) {
				if (stones[start] == 'W')
					white--;
				else
					black--;

				curLen--;
				start++;
			} else {
				if (stones[end] == 'W')
					white++;
				else
					black++;

				curLen++;
				end++;
			}

			if (black <= maxBlackStone && white >= minWhiteStone) {
				maxLen = Math.max(curLen, maxLen);
			}
		}
		System.out.println(maxLen);
	}
}
