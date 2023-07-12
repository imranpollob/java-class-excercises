import java.io.IOException;

public class MyException {
    public static void testException(int a) throws IOException {
        if (a == 1) {
            throw new IOException("Added some text");
        }
        System.out.println(a);
    }

    public static void testCustomException() throws MyCustomException {
        throw new MyCustomException("My custom msg");
    }

    public static void test() {
        try {
            testException(5);
            testCustomException();
        } catch (IOException|NullPointerException e) {
            e.getStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Exception is catched");
        } catch (MyCustomException e) {
            e.getStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("MyCustomException is catched");
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally I am here");
        }
    }



}
