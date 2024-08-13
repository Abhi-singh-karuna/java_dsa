package week_01.Java_code.loops;

import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick your fav number here : ");
        int x = sc.nextInt();

        // break in for loop
        for (int i = 0; i <= x; i+=2) {
            System.out.println("your no is : " + i);
            if (i > 10) break;
        }

        // break in while loop

        while (x <5 ){
            System.out.println("Your no is "+x);
            x++;
            if (x==3) break;

        }

        // break in do- while loop

        do {
            System.out.println("Your no is : "+ x);
            x++;
            if (x == 6) break;
        } while (x < 10) ;


        /* Continue Statement   */

        // to skip any particular loop we use Continue statement ;

        // Continue in For loop

        for (int i = 0; i < x; i++) {
            if (i == 3 || i ==10 || i >15) continue;
            System.out.println("You get the Toffee bro :" + i);
        }

        // continue for while loop

    }
}
