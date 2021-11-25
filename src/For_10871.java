import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class For_10871 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Asize = sc.nextInt();
        int num = sc.nextInt();
        List<Integer> SmallNum= new ArrayList();
        for(int i=0;i<Asize; i++){
            int Anum = sc.nextInt();
            if(Anum<num) SmallNum.add(Anum);
        }
        for (int i : SmallNum) System.out.printf(i+" ");
    }
}
