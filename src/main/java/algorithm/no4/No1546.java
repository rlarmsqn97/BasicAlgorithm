package algorithm.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] score = new double[n];
        double max = 0.0;
        double sum = 0.0;
        double avg = 0.0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(score[i],max);
        }
        for(int i=0; i < n; i++) {
            score[i] = score[i]/max*100;
        }
        for(double s : score) {
            sum += s;
        }
        avg = sum/n;
        System.out.println(avg);
    }
}
