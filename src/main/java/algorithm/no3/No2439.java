package algorithm.no3;

import java.util.Scanner;

public class No2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i < n; i++) {
            for(int j=i; j < n-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
