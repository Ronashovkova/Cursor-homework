public class ArithmeticPrimitives {
    /*Task 1: Try   all arithmetic operations (+ - * /) with primitives:
    byte, short, long, double, float, write results of each operation into console (System.out.println())*/

    public static void main(String[] args) {

        byte byte1 = 5;
        byte byte2 = 127;
        short short1 = 333;
        short short2 = 222;
        long long1 = 77777777L;
        long long2 = 88888888L;
        double double1 = 0.746;
        double double2 = 0.987;
        float float1 = 0.123f;
        float float2 = 0.321f;

        System.out.println(byte1 + byte2);
        System.out.println(short1 - short2);
        System.out.println(long1 * long2);
        System.out.println(double1 / double2);
        System.out.println(float1 + float2);
        System.out.println(long1 + float1); //не розумію, чому такий результат вийшов 7.7777776Е7 буду розбиратись
        System.out.println(double1 + byte1);
        System.out.println(float2 / double1);
    }
}

