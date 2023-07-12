import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyFile {
    public static void test() throws FileNotFoundException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create a file
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.print("John T. Perez ");
        output.println(90);
        output.print("Jamal K. Johnson ");
        output.println(85);

        // Close the file
        output.close();
    }
}
