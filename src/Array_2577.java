import java.util.Scanner;

public class Array_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {0,0,0,0,0,0,0,0,0,0};
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int mul = A*B*C;
        String mulString = mul + " ";
        for(int i = 0; i < mulString.length()-1; i++){
            int index = mulString.charAt(i)-48;
            num[index]++;
        }
        for (int i : num) System.out.println(i);
    }
}
