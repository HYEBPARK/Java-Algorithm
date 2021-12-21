import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumSort_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<N;i++) list.add(Integer.parseInt(bf.readLine()));
        Collections.sort(list);

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i) + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
