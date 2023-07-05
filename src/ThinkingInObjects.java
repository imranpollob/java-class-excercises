import java.math.BigInteger;

public class ThinkingInObjects {
    public static void test() {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        double d = new Double(15.6);
//        System.out.println(d);
//        double strd = Double.valueOf("17.23");
//        System.out.println(strd);
//        System.out.println(Integer.parseInt("10", 2));
//        BigInteger a = new BigInteger("12345678987654");
//        BigInteger b = new BigInteger("2");
//        System.out.println(a.add(b));
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("World");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb2.append("123");
        System.out.println(sb2);
        sb2.insert(1, "AAA");
        System.out.println(sb2);
    }


}
