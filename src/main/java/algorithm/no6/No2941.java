package algorithm.no6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2941 {
    public static void main(String[] args) throws IOException {
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=0; i<arr.length; i++) {
            System.out.println(s);
            if(s.contains(arr[i])) {
                System.out.println(s);
                s = s.replaceAll(arr[i], "0");
            }
        }
        System.out.println(s.length());
    }
}
