import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class SortInside_1427 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char str[] = new char[s.length()];
        for(int i = 0 ; i<s.length();i++) str[i] = s.charAt(i);
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1 ; i >=0 ;i--){
            sb.append(str[i]);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
