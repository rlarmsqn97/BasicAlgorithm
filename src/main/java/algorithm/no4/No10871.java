package algorithm.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] s = bf.readLine().split("\\s");
        int[] num = new int[n];

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < n; i++) {
            num[i] = Integer.parseInt(s[i]);
            if(x > num[i]) {
                sb.append(num[i]).append(" ");
            }
        }
        System.out.println(sb);

    }
}
