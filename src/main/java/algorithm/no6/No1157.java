package algorithm.no6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        int[] arr = new int[26];

        for(int i=0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int max = 0;
        char ch = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 97);
            } else if(arr[i] == max){
                ch = '?';
            }
        }
        sb.append(String.valueOf(ch).toUpperCase());

        System.out.println(sb);

    }
}
