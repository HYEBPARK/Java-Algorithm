import java.util.Arrays;
import java.util.Comparator;

public class BigNum_42746 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,30,34,5,9}));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        String []arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(arr[0].equals("0")) return "0";
        for (String s : arr) answer += s;
        return answer;
    }
}
