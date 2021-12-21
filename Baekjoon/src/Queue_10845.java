import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_10845 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> d = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N ; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            switch (st.nextToken()){
                case "push" : d.offer(Integer.parseInt(st.nextToken()));
                              break;
                case "pop" : if(!d.isEmpty()) sb.append(d.poll()+"\n");
                             else sb.append(-1+"\n");
                             break;

                case "size" : sb.append(d.size()+"\n");
                                break;
                case "empty" : if(d.isEmpty()) sb.append(1+"\n");
                                else sb.append(0+"\n");
                                break;
                case "front" : if(d.isEmpty()) sb.append(-1+"\n");
                                else sb.append(d.peekFirst()+"\n");
                                break;
                case "back" : if(d.isEmpty()) sb.append(-1+"\n");
                                else sb.append(d.peekLast()+"\n");
                                break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
