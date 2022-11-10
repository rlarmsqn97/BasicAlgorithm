package algorithm.no3;

import java.util.Scanner;

public class No8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rs = 0;
        for(int i=0; i <= n; i++) {
            rs += i;
        }
        System.out.println(rs);
        sc.close();
    }
}
