public class ForLoop {
    public static void test() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        for (int m = 1; m <= 3; System.out.println(m)) {
            for (int n = 1; n <= 10; m++, n++) {
                System.out.println("m: " + m + " n:" + n);
            }
        }

//        while (true) {
//            System.out.println("Will run for ever");
//        }

//        for (;;) {
//            System.out.println("Will run for ever");
//        }

    }
}
