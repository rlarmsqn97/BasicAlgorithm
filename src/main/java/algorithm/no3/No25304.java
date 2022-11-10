package algorithm.no3;

import java.util.Arrays;
import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int[] rs = new int[n];
        for(int i=0; i < n; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            rs[i] = price * count;
        }
        if(total == Arrays.stream(rs).sum()){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
