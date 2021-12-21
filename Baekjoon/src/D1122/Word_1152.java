package D1122;

import java.util.Scanner;

public class Word_1152{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        if(s.length==0) System.out.println(0);
        else if(s[0].equals("")) System.out.println(s.length-1);
        else System.out.println(s.length);
    }
}
