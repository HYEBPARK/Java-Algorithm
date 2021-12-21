
public class SelfNum_4673 {
    public static void main(String[] args) {

       int array[] = new int[10001];
       for(int k = 0; k<array.length;k++) array[k] = 0;
        array[0] = 1;
       int i =1;
       while(i<10000){
           int sum = i;
           String num = i+"";

           for(int k = 0; k<num.length();k++){
                sum += num.charAt(k)-48;
           }
           if(sum<=10000) array[sum] = 1;
           i++;
       }

       for(int k = 0; k<array.length;k++){
           if(array[k] == 0) System.out.println(k);
       }



    }
}
