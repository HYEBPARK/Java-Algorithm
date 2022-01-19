import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinHeap_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        MinHeap mh = new MinHeap();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                System.out.println(mh.delete());
            } else {
                mh.insert(num);
            }

        }
    }
}

class MinHeap {
    List<Integer> list;

    public MinHeap() {
        list = new ArrayList<>();
        list.add(0);
    }

    public void insert(int val) {
        // 1. leaf 마지막에 삽입
        list.add(val);
        int cur = list.size() - 1;
        int parent = cur / 2;

        // 2. 부모와 비교 후 조건에 맞지 않으면 Swap
        // 3. 조건이 만족되거나 root까지 반복
        while (true) {
            if (parent == 0 || list.get(parent) <= list.get(cur)) {
                break;
            }

            int temp = list.get(parent);
            list.set(parent, list.get(cur));
            list.set(cur, temp);

            cur = parent;
            parent = cur / 2;
        }
    }

    public int delete() {
        if (list.size() == 1) return 0;
        int top = list.get(1);
        // 1. Root에 leaf 마지막 데이터를 가져온다.
        list.set(1, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        // 2. 자식과 비교 후 조건이 맞지 않으면 swap
        // 3. 조건이 만족되거나 leaf 까지 반복
        int curPosition = 1;
        while (true) {
            int leftPosition = curPosition * 2;
            int rightPosition = curPosition * 2 + 1;

            // 왼쪽 자식이 없으면 오른쪽 자식도 없음
            // 그래서 왼쪽 자식이 없을경우 cur이 leaf
            if (leftPosition >= list.size()) break;


            // 왼쪽 자식이 제일 작다고 가정
            int minVal = list.get(leftPosition);
            int minPosition = leftPosition;

            // 오른쪽 자식이 있고, 그 자식이 더 작은가?
            if (rightPosition < list.size() && list.get(rightPosition) < minVal) {
                minVal = list.get(rightPosition);
                minPosition = rightPosition;
            }

            // 조건에 맞지 않아 swap
            if (list.get(curPosition) > minVal) {
                int temp = list.get(curPosition);
                list.set(curPosition, list.get(minPosition));
                list.set(minPosition, temp);
                curPosition = minPosition;
            }
            // 조건에 만족
            else {
                break;
            }
        }
        return top;
    }
}
