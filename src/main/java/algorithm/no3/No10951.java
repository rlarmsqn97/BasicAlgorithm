package algorithm.no3;

import java.io.*;
import java.util.StringTokenizer;

public class No10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String s;
        while((s = br.readLine()) != null && !s.isEmpty()) {
            st = new StringTokenizer(s," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
