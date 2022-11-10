package algorithm.no2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] num = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        if(num[0] == num[1] && num[0] == num[2]) {
            System.out.println(10000+num[0]*1000);
        } else if(num[0] == num[1] || num[1] == num[2] || num[0] == num[2]) {
            if(num[0] == num[1]) {
                System.out.println(1000+num[0]*100);
            } else if(num[1] == num[2]) {
                System.out.println(1000+num[1]*100);
            } else {
                System.out.println(1000+num[0]*100);
            }
        } else {
            if(num[0] > num[1] && num[0] > num[2]) {
                System.out.println(num[0]*100);
            } else if(num[1] > num[0] && num[1] > num[2] ) {
                System.out.println(num[1]*100);
            } else {
                System.out.println(num[2]*100);
            }
        }

        br.close();
    }
}
