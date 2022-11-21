package algorithm.no6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuffer a = new StringBuffer(st.nextToken());
        StringBuffer b = new StringBuffer(st.nextToken());

        int aa = Integer.parseInt(a.reverse().toString());
        int bb = Integer.parseInt(b.reverse().toString());

        System.out.println(aa > bb ? aa : bb);
    }
}
