//비트연산으로 풀이하는 방법

import java.util.Arrays;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] Barr = new String[n];
        for(int i =0;i<arr1.length;i++){
            Barr[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(Barr[i].length()<n){
                while (Barr[i].length()<n) Barr[i] = "0"+Barr[i];
            }
            answer[i] = Barr[i].replace("0"," ").replace("1","#");
        }

        return answer;
    }
}

class SM{
    public static void main(String[] args) {
        int n = 5;
        int arr1[] = {9,20,28,18,11};
        int arr2[] = {30,1,21,17,28};

        System.out.println(Arrays.toString(SecretMap.solution(n,arr1,arr2)));
    }
}
