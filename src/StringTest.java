public class StringTest {
    public static void test() {
        int a = 5;
        int b = a; // 5
        a = 7;
        System.out.println("a: " + a + " b: " + b);

        String s1 = "Hello";
        String s2 = s1; // "Hello";
        s1 = "Hi";
        System.out.println("s1: " + s1 + " s2: " + s2);

        System.out.println("abc".toUpperCase());
        System.out.println(" abc  ".length());
        System.out.println(" abc  ".trim().length());
        System.out.println("abc".charAt(1));

        String first = "c";
        String second = "b";
        System.out.println(first.equals(second));
        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));

        System.out.println("Hello World".substring(0, 5));
        System.out.println("Hello World".indexOf('W'));
        System.out.println("Hello World".indexOf('X'));

        String num1 = "123";
        String num2 = a + "";
        System.out.println(Integer.parseInt(num1));
        System.out.println(num2);

        int count = 5;
        double amount = 45.56;
        System.out.printf("count is %d and amount is %f", count, amount);
    }
}
