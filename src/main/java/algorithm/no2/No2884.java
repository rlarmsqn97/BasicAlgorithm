package algorithm.no2;

import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt() - 45;
//        int minus = minute - 45;
        if(minute < 0) {
            hour--;
            minute = 60 - (minute * -1);
        }
        if(hour < 0) {
            hour = 23;
        }

        System.out.println(hour + " " + minute);

        sc.close();
    }
}
