package week_01.java_code.loops;

import java.util.Scanner;

public class do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

//        while (i <=5){
//            System.out.println(i);
//            i++;
//        }

//        do while

        do {
            System.out.println(i);
            i++;
        } while (i<= 5);

        System.out.println(" Now out of the Loop : ");

    }
}
