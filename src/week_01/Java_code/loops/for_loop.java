package week_01.java_code.loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        System.out.println(" ---Here take a Input from user---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fav no here : ");
        int favNo = sc.nextInt();

        // for Loop
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(" this is your current iteration : " + (favNo *i));
        }

        // we can initialize many  vale  during

        for (int i = 0 ,sum =0 ; i<=10 ; i++){
            System.out.println(sum+=i);
            System.out.println();
        }


    }
}
