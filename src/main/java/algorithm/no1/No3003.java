package algorithm.no1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No3003 {
    public static void main(String[] args) {
        int[] piece = {1, 1, 2, 2, 2, 8};
        String[] white;
        Scanner sc = new Scanner(System.in);

        white = sc.nextLine().split("\\s");
        List<Integer> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < 6; i++) {
            result.add(piece[i] - Integer.parseInt(white[i]));
        }
        for (Integer integer : result) {
            sb.append(integer).append(" ");
        }

        System.out.println(sb);

        sc.close();
    }
}
