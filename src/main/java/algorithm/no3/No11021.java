package algorithm.no3;

import java.io.*;
import java.util.StringTokenizer;

public class No11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        StringTokenizer st;
        for(int i=0; i < t; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            bw.write("Case #"+i+": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +"\n");
        }

        bf.close();
        bw.flush();
        bw.close();
    }
}
