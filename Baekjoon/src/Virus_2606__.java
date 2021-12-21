import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Virus_2606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = sc.nextInt();
        int pair = sc.nextInt();
        int cnt = 0;

        LinkedList<Integer> list[] = new LinkedList[computer+1];
        for(int i =0; i<=computer; i++) list[i] = new LinkedList<>();

        boolean visited[] = new boolean[computer+1];

        // 인접 리스트 구현
        for (int i = 0; i < pair; i++){
            int var1 = sc.nextInt();
            int var2 = sc.nextInt();
            list[var1].add(var2);
            list[var2].add(var1);
        }


        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;


        while(!q.isEmpty()){
            int v = q.poll();
            while(!list[v].isEmpty()){

                if(visited[list[v].get(0)] == false){
                    q.add(list[v].get(0));
                    visited[list[v].remove()] = true;
                    cnt++;
                }

                else list[v].remove();
            }
        }
        System.out.println(cnt);
    }

}
