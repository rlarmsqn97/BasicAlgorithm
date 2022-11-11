package algorithm.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        boolean[] n = new boolean[42];
        int count = 0;
        for(int i=0; i < 10; i++) {
            int v = Integer.parseInt(bf.readLine());
            n[v % 42] = true;
        }
        for(boolean s : n) {
            if(s) {
                count++;
            }
        }
        System.out.println(count);

    }
}
