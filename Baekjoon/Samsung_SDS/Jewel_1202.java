import java.util.*;

public class Jewel_1202 {
    public static class Jewel {
        int weight;
        int price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int JewelNum = sc.nextInt();
        int bag = sc.nextInt();
        long sum = 0L;
        List<Jewel> jeweles = new ArrayList<>();
        PriorityQueue<Integer> bags = new PriorityQueue<>();
        for (int i = 0; i < JewelNum; i++) {
            int weight = sc.nextInt();
            int price = sc.nextInt();
            jeweles.add(new Jewel(weight, price));
        }

        jeweles.sort(Comparator.comparingInt(o -> o.weight));

        for (int i = 0; i < bag; i++) {
            int weight = sc.nextInt();
            bags.add(weight);
        }

        PriorityQueue<Jewel> pq = new PriorityQueue<>((o1, o2) -> o2.price - o1.price);
        int jIndex = 0;
        for (int i = 0; i < bag; i++) {
            int curBag = bags.poll();
            while (jIndex < JewelNum && jeweles.get(jIndex).weight <= curBag) {
                pq.add(jeweles.get(jIndex++));
            }
            if (!pq.isEmpty()) sum += pq.poll().price;
        }

        System.out.println(sum);

    }
}
