package algorithm.no6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = n;

        List<String> ckList = new ArrayList<>();

        String prev = null;

        for(int i=0; i < n; i++) {
            String s = br.readLine();
            String[] arr = s.split("");
            prev = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (!prev.equals(arr[j])) {
                    prev = arr[j];
                    ckList.add(arr[j-1]);
                }
                if (ckList.contains(arr[j])) {
                    cnt--;
                    break;
                }
            }
            ckList.clear();
        }

        System.out.println(cnt);

    }
}
