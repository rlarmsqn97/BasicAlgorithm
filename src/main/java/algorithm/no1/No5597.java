package algorithm.no1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        for(int i=0; i < 28; i++) {
            num.add(sc.nextInt());
        }
        for(int i=1; i-1 < 28; i++) {
            if(!num.contains(i)) {
                System.out.println(i);
            }
        }
        sc.close();

        /*Scanner sc = new Scanner(System.in);
        int[] student = new int[31];

        for(int i=1; i<29; i++) {
            int success = sc.nextInt();
            student[success] = 1;
        }
        for(int i=1; i<student.length; i++) {
            if(student[i]!=1)
                System.out.println(i);
        }

        sc.close();*/
    }
}
