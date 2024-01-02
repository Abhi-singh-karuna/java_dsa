package Old_files.pattern;

public class square {
    public static void main(String[] args) {
        // pattern 3
//        int n = 8;
//        int m = 8;
//        for(int i = 1 ; i< n ; i++){
//            for (int j = 1 ; j < i ; j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

//        pattern 4
//        int n = 6;
//        int m = 6;
//        for(int i = 1 ; i<= n ; i++){
//            for (int j = 1 ; j <= n-i ; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1 ; j <= i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // patter 5
        //        int n = 6;
//        int m = 6;
//        for(int i = 1 ; i<= n ; i++){
//            for (int j = 1 ; j <= n-i ; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1 ; j <= i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
        // pattern 6

        int n = 5;
        int m = 6;
        for(int i = 0 ; i<= n ; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <= (2*i-1); j++) {
                if (j == 2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n-1 ; i>= 0 ; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <= (2*i-1); j++) {
                if (j == 2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
