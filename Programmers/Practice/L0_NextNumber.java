// https://school.programmers.co.kr/learn/courses/30/lessons/120924

// public int solution(int[] common) {
// 		int lastIndex = common.length - 1;
//
// 		if (common[1] - common[0] == common[2] - common[1]) {
// 			return common[lastIndex] + common[2] - common[1];
// 		} else {
// 			return common[lastIndex] * (common[1] / common[0]);
// 		}
// 	}

public class L0_NextNumber {

	public int solution(int[] common) {
		int lastIndex = common.length - 1;

		if (isArithmetic(common[0], common[1], common[2])) {
			return common[lastIndex] + common[2] - common[1];
		}

		if (isGeometric(common[0], common[1], common[2])) {
			return common[lastIndex] * (common[1] / common[0]);
		}
		return -1;
	}

	private boolean isGeometric(int firstNum, int secondNum, int thirdNum) {
		return secondNum / firstNum == thirdNum / secondNum;
	}

	private boolean isArithmetic(int firstNum, int secondNum, int thirdNum) {
		return secondNum - firstNum == thirdNum - secondNum;
	}
}
