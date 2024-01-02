package week_01.Java_code;
// data casting = type casting
public class dataconversion {
    public static void main(String[] args) {
        System.out.println("here to use implicit and explicit conversion in java : ");
        int x = 10;
        byte y = 90;
        long countx = x ;
        long longdata = 9090;

        int intlongdata = (int)longdata; // data conversion may be you loss some data here.



        int age = 129 ;
        byte newAge = (byte) age;
        System.out.println(newAge);
    }
}
