package algorithm.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int[] arr;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];

            double sum = 0.0;

            for(int j=0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            double avg = sum/n;
            double cnt = 0;

            for(int k=0; k < n; k++) {
                if(arr[k] > avg) {
                    cnt++;
                }
            }

            sb.append(String.format("%.3f",(cnt/n)*100)).append("%\n");
        }

        System.out.println(sb);
    }
}
