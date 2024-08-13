package week_01.Java_code.CoditionarStatement_03;

import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Fav number here : ");
        int favNo = sc.nextInt();

        switch (favNo){
            case 1: case 2 :
                System.out.println(" 1 and 2 is fav no");
                break;
            case 3 :
                System.out.println(" 3 is fav no");
                break;
            default:
                System.out.println("no on is fav");
        }

    }
}
