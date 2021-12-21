package D1125;

import java.util.Scanner;

public class Palindrome_1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int L = s.length();
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < L; i++) {
            String newStr = s.substring(i);
            flag = true;
            for (int k = 0; k < newStr.length() / 2; k++) {
                if (newStr.charAt(k) != newStr.charAt(newStr.length() - k - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                index = i;
                break;
            }
        }
        if (flag == false) System.out.println(s.length() + s.length());
        else System.out.println(s.length() + index);
    }
}
