package week_01.Java_code.loops;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
