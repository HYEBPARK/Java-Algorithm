import java.util.Arrays;
import java.util.Scanner;

public class Array_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int scoreArr[] = new int[N];
        double sum = 0;
        for(int i = 0; i< N ; i++){
            scoreArr[i] = sc.nextInt();
        }
        Arrays.sort(scoreArr);
        for (int i = 0; i<N ; i++){
            sum += scoreArr[i]/scoreArr[scoreArr.length-1]*100;
        }
        System.out.println(sum/N);
    }
}
