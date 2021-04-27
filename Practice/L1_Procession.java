public class L1_Procession {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i =0;i<arr1.length;i++){
            for(int k =0;k<arr1[i].length;k++){
                answer[i][k]=arr1[i][k]+arr2[i][k];
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int [][]arr1={{1,2},{2,3},{3,5}};
        int [][]arr2={{1,2},{2,3},{3,5}};
        System.out.println(solution(arr1,arr2));
    }
}
