import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Alphabet_10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int a[] = new int[26];
        for(int i = 0; i<a.length;i++) a[i] = -1;
        for(int i = 0; i<s.length(); i++){
            if(a[s.charAt(i)-97] ==-1){
                a[s.charAt(i)-97] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<a.length-1; i++) sb.append(a[i]+" ");
        sb.append(a[a.length-1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
