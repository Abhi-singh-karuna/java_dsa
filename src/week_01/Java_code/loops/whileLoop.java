package week_01.Java_code.loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int x = sc.nextInt();
// while loop
        while ( x < 12){
            System.out.println("this number " + x);
            x++;
        }
    }

}
