package D1205;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Ecology_4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Double> tree = new TreeMap<>();
        double cnt = 0;
        String name = br.readLine();
        while (true){
            if(tree.containsKey(name)) tree.put(name, tree.get(name) + 1);
            else tree.put(name, 1.0);
            cnt++;
            name = br.readLine();
            if(name == null || name.length() ==0) break;
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Double> i : tree.entrySet()){
            String ratio = String.format("%.4f",i.getValue()/cnt*100);
            sb.append(i.getKey()).append(" ").append(ratio).append("\n");
        }
        System.out.println(sb);
    }
}
