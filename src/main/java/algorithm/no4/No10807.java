package algorithm.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split("\\s");
        String v = bf.readLine();
        int count = 0;
        for(int i=0; i < arr.length; i++) {
            if(arr[i].equals(v)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
