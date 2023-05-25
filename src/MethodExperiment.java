public class MethodExperiment {
    public static void test() {
        // It will find the maximum of two values
        // max of 12, 20
        // max of 912, 220
        // max of 126, 280
        System.out.println("max of 12, 20: " + maxOfTwo(12, 20));
        System.out.println("max of 912, 220: " + maxOfTwo(912, 220));
        System.out.println("max of 126, 280: " + maxOfTwo(126, 280));
        // find if a number is positive or zero or negative
        System.out.println("Sign of 5: " + signOfNumber(5));
        System.out.println("Sign of 0: " + signOfNumber(0));
        System.out.println("Sign of -75: " + signOfNumber(-75));

        printSomething();


        testOrder("erty", 45); // implicitly convert to double
//        testOrder(45, "aertyui");
        testOrder("double", 123.45678);

        int a = 5, b = 7;
        System.out.printf("Main function(before): a = %d b = %d\n", a, b);
        swap(a, b); // call by value
        System.out.printf("Main function(after): a = %d b = %d\n", a, b);

        System.out.println("Random character between d and j: " + randomCharacter('d', 'j'));
        System.out.println("Random character between d and j: " + randomCharacter('d', 'j'));
        System.out.println("Random character between d and j: " + randomCharacter('d', 'j'));
        System.out.println("Random character between A and K: " + randomCharacter('A', 'K'));

    }

    public static char randomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static void swap(int a, int b) {
        System.out.printf("Inside swap function: a = %d b = %d\n", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("Inside swap function: a = %d b = %d\n", a, b);
    }
    public static int maxOfTwo(int first, int second) {
        return first > second ? first : second;
//        int result;
//        if (first > second) {
//            result = first;
//        } else {
//            result = second;
//        }
//        return result;
    }

    private static String signOfNumber(int a) {
        if (a > 0) {
            return "positive number";
        } else if (a == 0) {
            return "it's a zero";
        } else {
            return "negative number";
        }
    }

    public static void printSomething() {
        System.out.println("Hello");
        if (2 == 2) {
            return;
        }
        System.out.println("World");
    }

    public static void testOrder(String a, double b) {
        System.out.println(a + " " + b);
    }





}
