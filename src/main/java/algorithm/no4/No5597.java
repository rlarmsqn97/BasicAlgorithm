package algorithm.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < 28; i++) {
           int k = Integer.parseInt(br.readLine());
           arr[k] = true;
        }
        for(int i=1; i < 31; i++) {
            if(!arr[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
