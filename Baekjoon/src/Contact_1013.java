import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contact_1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int check = 0, k = 0;
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '0')
                 {
                     k = 1;
                     if(j + k > str.length() - 1)
                     {
                         sb.append("NO");
                         break;
                     }
                     else if(j + k < str.length() && str.charAt(j+k) == '0')
                     {
                         if(check > 1 && j-1 >= 0 && str.charAt(j-1) == '1' )
                             j = j - 2;
                         else
                         {
                             sb.append("NO");
                             break;
                         }
                     }
                     else
                         j += k;
                     check = 0;
                 }
                 else
                 {
                     k = 1;
                     if(j + k >= str.length()-2 || j + k + 1 >= str.length()-1)
                     {
                         sb.append("NO");
                         break;
                     }
                     else if(str.charAt(j+k) !='0' || str.charAt(j+k+1) != '0')
                     {
                         sb.append("NO");
                         break;
                     }
                     else
                     {
                         k = 3;
                         while(j+k < str.length() - 1 && str.charAt(j+k) == '0')
                             k++;
                         if((j + k >= str.length()))
                         {
                             sb.append("NO");
                             break;
                         }
                         else if((j+k < str.length() && str.charAt(j+k) != '1'))
                         {
                             sb.append("NO");
                             break;
                         }
                         check = 0;
                         while(j+k < str.length() && str.charAt(j+k) == '1')
                         {
                             k++;
                             check++;
                         }
                         j += k-1;
                     }
                 }
                if(j >= str.length()-1)
                {
                    sb.append("YES");
                    break;
                }
            }
            if(i < T-1)
                sb.append("\n");
        }
        System.out.println(sb);
    }
}
