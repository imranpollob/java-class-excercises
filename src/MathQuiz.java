import java.util.Scanner;

public class MathQuiz {
    public static void quiz() {
        // generate two random numbers ---
//        System.out.println("A random number " + (int) (Math.random() * 100));
//        System.out.println("A random number " + System.currentTimeMillis());
        // take two numbers from the user
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
        int num1 = (int) (Math.random() * 100);
//        System.out.print("Enter the second number: ");
        int num2 = (int) (Math.random() * 100);

        int result = num1 + num2;
        // take input from the user
        System.out.println("What is " + num1 + " + " + num2 + " = ?" );
        int userResult = input.nextInt();
        // match the input with the computed result & give an output
        if (result == userResult) {
            System.out.println("Your answer is CORRECT!");
        } else {
            System.out.println("Your answer is WRONG!");
        }

        System.out.println(result == userResult ? "Your answer is CORRECT!" : "Your answer is WRONG!");

    }
}
