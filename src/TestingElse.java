public class TestingElse {
    public static void test() {
        int i = 1, j = 2, k = 3;
        if (i > j) {
            if (j < k) {
                System.out.println("Here in if");
            }
            else {
                System.out.println("We are in else");
            }
        }
    }
}
