package algorithm.no2;

import java.util.Scanner;

public class No2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int four = year % 4;
        int hundred = year % 100;
        int fourHundred = year % 400;
        if(four == 0 && hundred != 0 && fourHundred == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
