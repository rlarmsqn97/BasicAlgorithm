package algorithm.no4;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min=1000001,max=-1000000;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        System.out.println(min + " " + max);
    }
}
