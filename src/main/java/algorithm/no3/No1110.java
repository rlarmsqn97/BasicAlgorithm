package algorithm.no3;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int copy = n;

        do {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;
        } while(n != copy);

        System.out.println(count);
    }
}
