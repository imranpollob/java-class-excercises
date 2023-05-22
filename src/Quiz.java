import java.util.Scanner;

public class Quiz {
    // you will ask for a random addition of two numbers
    // ask 10 questions
    // take input from the user
    // if the result is right give him/her 10 points
    // and end of the quiz show the total points user got
    // -------
    // while the quiz is running, if the point is more than 50,
    // then immediately say "You WON" and end the quiz by showing the point.
    // -------
    // if the it is question 10 but the point is below 50, give an
    // extra question, this question got 55 points.
    public static void test() {
        Scanner input = new Scanner(System.in);
        int point = 0;
        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 10) + 1;
            int b = (int) (Math.random() * 10) + 1;
            System.out.printf("What is %d + %d = ", a, b);
            int userInput = input.nextInt();
            if (a + b == userInput) {
                point += 10;
            }
            if (point == 50) {
                System.out.println("YOU WON!");
                break;
            }
            if (i == 10) {
                a = (int) (Math.random() * 10) + 1;
                b = (int) (Math.random() * 10) + 1;
                System.out.printf("Bonus question! (55 point)\n What is %d + %d = ", a, b);
                userInput = input.nextInt();
                point += (a + b) == userInput ? 55 : 0;
            }
        }

        System.out.println("You score is: " + point);
    }
}
