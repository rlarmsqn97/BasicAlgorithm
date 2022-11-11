package algorithm.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        int cnt=0, sum=0;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < n; i++) {
            s[i] = br.readLine();
            for(int k=0; k < s[i].length(); k++) {
                if(s[i].charAt(k) == 'O') {
                    cnt += 1;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            sb.append(sum).append("\n");
            sum = 0; // 배열끝날때마다 초기화
            cnt = 0;
        }
        System.out.println(sb);

    }
}
