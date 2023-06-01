import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void test() {
//        createArray();
//        getValuesFromUser();
//        practice();
//        arrayCopy();

//        // array is reference type
//        int[] nums = {1,2,3};
//        printArray(nums);
//        // it will change the original value
//        changeValue(nums);
//        printArray(nums);
//
//        int[] source = {1,2,3};
//        printArray(reverse(source));

//        argumentCheck(1,2,3,4,5);
//        argumentCheck(7,8);

        userDefaultFunction();
    }


    public static void createArray() {
        // integer array, size 5
        int[] numbers = new int[5];
        double[] grades;
        grades = new double[3];
//        grades = { 1.0, 2.0 }; // Error!!

        numbers[0] = 123;
        numbers[4] = 789;

        System.out.println("First value: " + numbers[0]);
        System.out.println("Length: " + numbers.length);
        System.out.println("Last value: " + numbers[numbers.length - 1]);

        boolean[] myBoolean = new boolean[3];
        System.out.println(myBoolean[0]);

        int[] num1 = { 1, 2, 3, 4 };
        int[] num2 = new int[4];
        num2[0] = 1;
        num2[1] = 2;
        num2[2] = 3;
        num2[3] = 4;
        System.out.println("Second value of num1: " + num1[1]);
        System.out.println("Length of num1: " + num1.length);
    }

    public static void getValuesFromUser() {
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number: ");
            num[i] = input.nextInt();
        }

        System.out.println("The largest number is: " + getLargestElement(num));

        shiftValues(num);
    }

    public static void printArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("Value at index " + i + " is: " + num[i]);
        }

//        for (int n: num) {
//            System.out.println(n);
//        }
    }

    public static int getLargestElement(int[] num) {
        // set the first number as the largest element
        // loop through the array elements
        // check if the current number is greater than
        // the large number, if so, update the large number
        int largest = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        return largest;
    }

    public static void shiftValues(int[] num) {
        // store the first value to a variable
        // run the loop, and take the next value to current value
        // update the last number with the stored variable
        int firstNumber = num[0];
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = num[i + 1];
        }
        num[num.length - 1] = firstNumber;
        printArray(num);
    }

    public static void practice() {
        // create an int array with 10 random numbers
        // find the sum of all numbers
        // find the average
        // show all numbers
        // show all numbers that are above the average number
        // --------------------------
        // Take an int number from user
        // use the number as the size of the array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        for (int i = 0 ; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        int total = 0;
        // finding the sum
        for (int i : numbers) {
            total += i;
        }

        double average = total / numbers.length;
        // show all numbers
        printArray(numbers);

        System.out.println("Total is: " + total);
        System.out.println("Average is: " + average);

        // print above average numbers
        for (int i : numbers) {
            if (i > average) {
                System.out.println(i);
            }
        }
    }

    public static void arrayCopy() {
        int[] a = {1,2,3};
        int[] b = {7,8,9};
        int[] c = new int[3];
        b = a;
        printArray(b);
        a[0] = 999;
        printArray(b);

        for (int i = 0; i< a.length; i++) {
            c[i] = a[i];
        }
        a[0] = 12345;
        printArray(c);

        int[] d = new int[3];
        System.arraycopy(a, 0, d, 0, d.length);
        a[0] = 12;
        printArray(d);


    }


    public static void changeValue(int[] numbers){
        numbers[0] = 999;
    }

    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        int j = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            reversed[j] = numbers[i];
            j--;
        }

        return reversed;
    }

    public static void argumentCheck(int... numbers) {
        printArray(numbers);
    }

    public static void userDefaultFunction() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] numbers2 = {234,3456,456,567,678};
        System.out.println(Arrays.binarySearch(numbers, 5));
        Arrays.sort(numbers2);
        System.out.println(numbers2.toString());
        printArray(numbers2);
        int[] num3 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.equals(numbers, num3));
        Arrays.fill(num3, 10);
        printArray(num3);

    }

}
