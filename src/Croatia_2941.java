import java.util.Scanner;
import java.util.Stack;

public class Croatia_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        Stack<Character> s = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) s.push(str.charAt(i));
        while (s.size() > 1) {
            switch (s.pop()) {
                case 'c':
                    cnt++;
                    if (s.peek() == '-' || s.peek() == '=') s.pop();
                    break;

                case 'd':
                    cnt++;
                    if (s.peek() == '-') s.pop();
                    else if (s.peek() == 'z' && s.size() > 1) {
                        s.pop();
                        if (s.peek() == '=') s.pop();
                        else cnt++;
                    }
                    break;

                case 'l':
                case 'n':
                    cnt++;
                    if (s.peek() == 'j') s.pop();
                    break;

                case 's':
                case 'z':
                    cnt++;
                    if (s.peek() == '=') s.pop();
                    break;

                default:
                    cnt++;
            }
        }
        if (s.size() == 1) cnt++;
        System.out.println(cnt);
    }
}
