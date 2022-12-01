package algorithm.no6;

import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        for(int i=0; i < 26; i++) {
            arr[i] = -1;
        }
        for(int i=0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for(int v : arr) {
            System.out.print(v + " ");
        }
    }
}
