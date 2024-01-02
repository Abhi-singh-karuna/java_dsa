package week_01.Java_code.opertor;

public class operators {
    public static void main(String[] args) {

        int a = 29 ;
        int b =10 ;

        /* Arithmatic Operator  */
        // addition
        int res = a+b;
        System.out.println(res);


        // subtraction

        int subres = a-b ;
        System.out.println(subres);


        // division

        double divres  = (double)a/b;
        System.out.println(divres);

        // module

        int modRes = a%b;
        System.out.println(modRes);

        /* Assignment Operator  */
        // += , -+ , *= , /= , %=
        a += b;  // here value of a will changed
        System.out.println(a);

        /* Relational Operator */

        System.out.println(a==b);
        System.out.println(3==3);

        /* Logical Operator */

        boolean expOne = true;
        boolean expTwo = false;

        System.out.println(true&&false);
        System.out.println(true||false);
        System.out.println(!true);

        System.out.println(expOne && expTwo);
        System.out.println(expOne || expTwo);
        System.out.println(!expTwo);


        /* Taking Input from user */






    }
}
