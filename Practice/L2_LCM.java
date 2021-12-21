public class LCM_12953 {
    public static void main(String[] args) {
        int []arr = {2,6,8,14};
        System.out.println(solution(arr));
    }
    private static int solution(int[] arr) {
        int answer = 0;
        int num1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int num2 = arr[i];
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            if (max % min != 0) {
                while (min != 0) {
                    int temp = max;
                    max = min;
                    min = temp % min;
                }
                num1 = num1 * num2 / max;
            } else num1 = max;
        }
        answer = num1;
        return answer;
    }
}
