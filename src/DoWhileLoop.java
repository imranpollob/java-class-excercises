public class DoWhileLoop {
    public static void test() {
        int i = 10;

        while (i < 5) {
            System.out.println("(while) i is: " + i);
        }

        do {
            System.out.println("(do while) i is: " + i);
        } while (i < 5); // we have a semicolon here.


        for (int j = 1; j <= 3; j++) {
            System.out.println(j);
        }

        int k = 1;
        while (k <= 3) {
            System.out.println(k);
            k++;
        }

    }
}
