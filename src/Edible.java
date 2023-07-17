public interface Edible {
    // by default it's public static final
    int count = 1;
    // by default it's public abstract
    void howToEat();

    public default void test() {
        System.out.println("Default method in Java 8");
    }

    public static void test2() {
        System.out.println("Static methods are allowed in Java 8");
    }
}
