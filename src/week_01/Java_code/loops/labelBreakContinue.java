package week_01.Java_code.loops;

public class labelBreakContinue {
    public static void main(String[] args) {

        Outerloop:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (j==2) continue Outerloop;
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
