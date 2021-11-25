
import java.util.Scanner;

public class Floor_1388 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char map[][] = new char[N][M];

        for(int i =0; i< N; i++){
            String a = sc.next();
            for(int k =0; k<M ; k++){
                map[i][k] = a.charAt(k);
            }
        }
        int cnt = 0;

        for(int i =0; i< N ;i++){
            for(int k = 0 ; k<M ;k++){
                if(map[i][k] == '-') {
                    cnt++;
                    while (k<M && map[i][k] == '-') k++ ;
                }
            }
        }

        for(int i =0; i< M ;i++){
            for(int k = 0 ; k<N ;k++){
                if(map[k][i] == '|') {
                    cnt++;
                    while (k<N && map[k][i] == '|') k++ ;
                }
            }
        }

        System.out.println(cnt);

        }
    }

