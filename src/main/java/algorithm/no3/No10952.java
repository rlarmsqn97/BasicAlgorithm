package algorithm.no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String[] s = br.readLine().split("\\s");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if(a == 0 && b == 0) {
                break;
            }
            sb.append(a+b+"\n");
        }
        System.out.println(sb);
    }
}
