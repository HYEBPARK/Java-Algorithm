package D1126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        while (!s.equals("0")){
            flag = true;
            for(int k = 0; k<s.length()/2; k++){
                if(s.charAt(k) != s.charAt(s.length()-k-1)){
                    flag = false;
                    break;
                }
            }
            if(flag == false) sb.append("no").append("\n");
            else sb.append("yes").append("\n");
            s = br.readLine();
        }
        System.out.println(sb);
    }
}
