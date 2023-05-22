public class BreakAndContinue {
    public static void test() {
        int i = 1;
        int sum = 0;
        // 1 + 2 + 3 + .... + 100
        while(i <= 100) {
            sum += i; // sum = sum + i
            i++;
            // get out of the loop when sum is 100
            if (sum >= 100) {
                break;
            }
        }

        System.out.println("SUM: " + sum + " i: " + i);


        for (int j = 1; j <= 10 ; j++) {
            // if j is 5, then don't print the value
            if (j == 5 || j == 7) {
                continue;
            }
            System.out.println("j is " + j);
        }



    }
}
