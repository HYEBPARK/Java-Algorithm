package D1213;

import java.util.Scanner;

public class Flower_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<testcase; i++){
            int day = sc.nextInt();
            int days[] = new int[day];
            int waterCheck = 0, NowaterCheck = 0, flower = 1;
            for(int j = 0; j<day; j++) days[j] = sc.nextInt();
            for(int j = 0; j<day; j++){
                    if (days[j] == 1) {
                        NowaterCheck = 0;
                        waterCheck++;
                        flower++;
                        if (waterCheck == 2) {
                            flower += 4;
                        }
                    } else {
                        NowaterCheck++;
                        waterCheck = 0;
                        if (NowaterCheck == 2) {
                            flower = -1;
                            break;
                        }
                    }
            }

            sb.append(flower).append("\n");
        }
        System.out.println(sb);
    }
}
