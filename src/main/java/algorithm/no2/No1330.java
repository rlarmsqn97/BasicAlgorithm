package algorithm.no2;

import java.util.Scanner;

public class No1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[2];
        String[] s;
        s = sc.nextLine().split("\\s");
        numArr[0] = Integer.parseInt(s[0]);
        numArr[1] = Integer.parseInt(s[1]);

        if(numArr[0] < numArr[1]) {
            System.out.println("<");
        } else {
            System.out.println(">");
        }

    }
}
