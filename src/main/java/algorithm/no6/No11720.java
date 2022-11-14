package algorithm.no6;

import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nn = sc.next();
        int sum = 0;
        for(int i=0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(String.valueOf(nn).charAt(i)));
        }
        System.out.println(sum);
        sc.close();
    }
}
