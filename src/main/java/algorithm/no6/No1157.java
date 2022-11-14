package algorithm.no6;

import java.util.Scanner;

public class No1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int[] arr = new int[26];

        for(int i=0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }



    }
}
