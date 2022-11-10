package algorithm.no2;

import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t = sc.nextLine().split("\\s");
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int ct = sc.nextInt();

        if(m + ct > 60) {
            h++;
            m = 60 - (m + ct);
            if((m*-1) == 60) {
                h++;
                m = 0;
            }
            if(h >= 24) {
                h = 0;
            }
            System.out.println(h + " " + (m*-1));
        } else {
            System.out.println(h + " " + (m + ct));
        }

        sc.close();
    }
}
