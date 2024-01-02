package week_01.Java_code.opertor;

import java.util.Scanner;

public class TakingInputfromUser {
    public static void main(String[] args) {

        /*taking input as string*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("My age is  : " + age);

        System.out.println("Enter your float no.");
        float myFloatNo = sc.nextFloat();
        System.out.println("my float no is : " + myFloatNo);

        System.out.println("Enter Your address : ");
        String myString = sc.next();
        System.out.println("My first time string is : " + myString);

        sc.close();
    }
}
