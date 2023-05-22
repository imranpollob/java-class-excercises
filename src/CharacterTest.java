//import static java.lang.Character.isDigit;

public class CharacterTest {
    public static void test() {
        System.out.println("\u00A5");
        System.out.println("\u0985");
        char a = 'a';
        System.out.println(a);
        System.out.println(++a);
        System.out.println("A\tB\u0009C");
        System.out.println("\"Hello World\"");
        System.out.println("Backslash \\");
        int i = 'a';
        System.out.println(i);
        System.out.println("Is 5 a digit? " + Character.isDigit('5'));
        System.out.println("Is 5 a letter? " + Character.isLetter('5'));
        System.out.println("A in lowercase is: " + Character.toLowerCase('A'));

    }
}
