import java.util.Scanner;

public class GroupWord_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        String word[] = new String[n];
        for (int i = 0; i < n; i++) word[i] = sc.next();
        for(int i =0; i<word.length;i++){
            boolean check[] = new boolean[26];
            boolean test = true;
            for(int k=0; k<word[i].length();k++){
                check[word[i].charAt(0)-97] = true;
                if(!check[word[i].charAt(k)-97]) check[word[i].charAt(k) - 97] = true;
                else {
                    if(k>1 && word[i].charAt(k-1)!=word[i].charAt(k)) {
                        test = false;
                        break;
                    }
                }
            }
            if(test == true) cnt++;
        }
        System.out.println(cnt);
    }
}
