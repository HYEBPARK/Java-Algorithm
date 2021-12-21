
public class test {
    public static int[] src;
    public static int[] tmp;

    public static void main(String[] args) {
        src = new int[]{1, 9, 8, 5, 4, 2, 3, 7};
        tmp = new int[src.length];
        printArray(src);
        mergeSort(0, src.length - 1);
        printArray(src);
    }

    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            int left = start;
            int right = mid + 1;
            int idx = left;
            while (left <= mid || right <= end) {
                if (right > end || (left <= mid && src[left] < src[right])) {
                    tmp[idx++] = src[left++];
                } else {
                    tmp[idx++] = src[right++];
                }
            }
            for (int i = start; i <= end; i++) {
                src[i] = tmp[i];

            }
            for (int i = 0; i < tmp.length; i++) {
                System.out.print(tmp[i]);

            }
            System.out.println();
        }

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();
    }
}

