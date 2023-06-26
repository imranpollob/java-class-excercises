package report;

public class ShowReport {
    public void test() {
        System.out.println("Hello Packages!");
        A a = new A();
        System.out.println(a.number(5));
    }

    private class A {
       private int number(int a) {
           return a * 2;
       }
    }
}
