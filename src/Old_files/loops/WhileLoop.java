package old_files.loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5){
//            System.out.println(i);
//            i++;
//        }
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        while (!x){
            System.out.println("have you understood");
            x = sc.nextBoolean();
        }
    }
}



