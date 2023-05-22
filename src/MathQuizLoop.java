import java.util.Scanner;

public class MathQuizLoop {
    public static void test() {
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int result = num1 + num2;
        // take input from the user
        System.out.println("What is " + num1 + " + " + num2 + " = ?" );
        int userResult = input.nextInt();
        // if the addition is wrong, take another input
        while (result != userResult) {
            System.out.println("Your answer is WRONG! Try again!!");
            userResult = input.nextInt();
        }

        if (result == userResult) {
            System.out.println("Your answer is RIGHT!!");
        }
    }
}
