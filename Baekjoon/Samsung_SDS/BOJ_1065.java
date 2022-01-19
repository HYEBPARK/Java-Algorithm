package D0114;

import java.util.Scanner;

public class BOJ_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i<=N ;i++){
            boolean flag = true;
            if(i < 100) cnt++;
            else{
                String num = String.valueOf(i);
                int a = num.charAt(1)-num.charAt(0);
                for(int j = 1; j < num.length()-1;j++){
                    if(a != num.charAt(j+1)-num.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
