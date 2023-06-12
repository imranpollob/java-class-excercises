public class InstanceAndStatic {
    int a = 5;
    static int b = 7;

    public void instanceMethod() {
        System.out.println(a + b);
        staticMethod();
    }

    public static void staticMethod() {
        // a is not accessible due to instance variable
//        System.out.println(a + b);
        // instance methods are not accessible
//        instanceMethod();
    }
}
