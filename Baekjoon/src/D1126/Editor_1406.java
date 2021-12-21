package D1126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Editor_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) list.add(c);
        int N = Integer.parseInt(reader.readLine());
        ListIterator<Character> it = list.listIterator(list.size());
        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String str = st.nextToken();
            switch (str) {
                case "L":
                    if (it.hasPrevious())
                        it.previous();
                    break;
                case "D":
                    if (it.hasNext()) //
                        it.next();
                    break;
                case "B":
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                case "P":
                    it.add(st.nextToken().charAt(0));
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);
        System.out.println(sb);
    }
}