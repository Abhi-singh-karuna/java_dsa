package week_01.java_code.loops;

public class nested_Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
