package week_01.java_code.coditionar_statement_03;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Fav number here : ");
        int favNo = sc.nextInt();

        /* If Else statement */

        // 1. conditional case if statement is true  then print both line otherwise only print second line
        if (favNo == 0)
            System.out.println("yes it is your fav no :");
            System.out.println("no it is not your fav");

        // simple if else statement written as this :
        if (favNo > 10) {
            System.out.println("return tue");
        } else  {
            System.out.println("return false");
        }

        // else if statement

        if (favNo == 10){
            System.out.println("this is your first fav");
        } else if (favNo == 20) {
            System.out.println("this is your second fav");
        } else {
            System.out.println("not your fav one");
        }

        /* Nested if else statement */

        // you are given 3 no find the max no

        int a = 24;
        int b = 113;
        int c = 55;

        if (a > b) {
            System.out.println("a is bigger than b");
            if (a>c){
                System.out.println("a is greater than c");
                System.out.println("a is tallest");
            }else {
                System.out.println("c is greater than a");
                System.out.println("c Is tallest");
            }

        } else {
            System.out.println("b is greater than a");
            if (b > c){
                System.out.println("b is greater than c ");
                System.out.println("b is tallest");
            } else {
                System.out.println("c is bigger than b");
                System.out.println("c is tallest");
            }
        }

        /*Ternary Operator*/
        // condition?expression1:expression2;

        a =12200;
        b =1949;
        c =255;

        int maxOfTwoNumber = a>b ?a :b;
        System.out.println(maxOfTwoNumber);

        int maxOfThree = a>b ? a>c ? a :c :  b>c ?b:c;
        System.out.println(maxOfThree);

    }
}
