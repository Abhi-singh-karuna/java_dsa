package old_files.conditionalStatement;

public class ElseIf {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your lucy number : ");
//        int a = 100;
//        int b = 20;
//        int c = 500;
//
//        if (a > b ) {
//            System.out.println(" a is greater than b");
//            if (a > c){
//                System.out.println(" a is greater than c ");
//                System.out.println(" a is the largest");
//            }else {
//                System.out.println("c is greater than a");
//                System.out.println(" c is largest");
//            }
//        }else {
//            System.out.println("b is greater than a");
//            if (b >c) {
//                System.out.println("b is greater than c");
//                System.out.println("b is largest");
//            }else{
//                System.out.println(" c is greater than b");
//                System.out.println(" c is largest");
//            }
//
//        }

        // Tenary  Operator

        int a = 5000000;
        int b =10000;
        int c = 15;
        int max =  a>b ? a>c ? a : c : b >c ? b : c ;
//        int max = (a >b) ? a : b;
        System.out.println(max);


    }
}
