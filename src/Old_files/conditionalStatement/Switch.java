package old_files.conditionalStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day :");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            default:
                System.out.println("not recomendede");
        }
    }
}
