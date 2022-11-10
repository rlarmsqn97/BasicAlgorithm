package algorithm.no1;

import java.util.Scanner;
import java.util.stream.Stream;

public class No2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int e = sc.nextInt();
        int[] eArr = Stream.of(String.valueOf(e).split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println(i * eArr[2]);
        System.out.println(i * eArr[1]);
        System.out.println(i * eArr[0]);
        System.out.println(i * e);

    }
}
