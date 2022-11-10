package algorithm.no1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10926 {
    public static void main(String[] args) {
        List<String> id = new ArrayList<String>(){{
            add("joonas");
            add("boo");
        }};
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        if(id.contains(name)) {
            System.out.println(name + "??!");
        } else {
            System.out.println(name);
        }
        sc.close();
    }
}
