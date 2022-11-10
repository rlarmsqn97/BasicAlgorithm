package algorithm.no1;

import java.util.Scanner;

public class No10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String slice;

        slice = sc.nextLine();
        String[] numArr = slice.split("\\s");

        int a = Integer.parseInt(numArr[0]);
        int b = Integer.parseInt(numArr[1]);
        int c = Integer.parseInt(numArr[2]);

        System.out.println((a + b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);

        sc.close();
    }
}
