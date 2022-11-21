package algorithm.no6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.trim();
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println(st.countTokens());
    }
}
