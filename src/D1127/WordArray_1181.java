package D1127;

import java.util.*;

public class WordArray_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<String> str = new HashSet<>();
        for (int i = 0; i < N; i++) str.add(sc.next());
        List<String> list = new ArrayList(str);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else if(o1.length() > o2.length()) return 1;
                else return -1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String i : list) sb.append(i).append("\n");
        System.out.println(sb);
    }
}
