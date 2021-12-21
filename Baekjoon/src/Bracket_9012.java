import java.util.Scanner;

public class Bracket_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str[] = new String[N];
        for (int i = 0; i < N; i++) str[i] = sc.next();
        for (String i : str) {
            int cnt = 0;
            while (i.contains("()")){
                i=i.replace("()", "");
            }
            if(i.contains("(")||i.contains(")")) System.out.println("NO");
            else System.out.println("YES");
        }


    }
}
