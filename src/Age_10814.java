import java.util.*;

public class Age_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        String arr[][] = new String[N][2];
        for(int i =0; i<N; i++){
            String age = sc.nextInt() +"";
            String name = sc.next();
            arr[i][0] = age;
            arr[i][1] = name;
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> Integer.parseInt(o[0])));
        for (int i = 0; i<N; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
