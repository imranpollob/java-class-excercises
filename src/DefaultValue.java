import java.util.Date;
import java.util.Random;

public class DefaultValue {
    public static int age = 18;

     static void test() {
         String name = "Adam";
//        System.out.println(name);
//
//        Date today = new Date();
//        System.out.println(today.toString());

        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));

        Random random1 = new Random(30);
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt(10));
    }
}
