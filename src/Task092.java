import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class Task092 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = Path.of("input.txt").toFile();
        File output = Path.of("output.txt").toFile();
        try (Scanner sc = new Scanner(input);
            PrintWriter printWriter = new PrintWriter(output)) {
            String s = sc.next().trim();

            int numberPetrOrSergei = 0;
            int numberKate = 0;
            int sum = Integer.parseInt(s);
            numberPetrOrSergei = sum/6;
            numberKate=numberPetrOrSergei*4;
            printWriter.write(numberPetrOrSergei + " " + numberKate + " " + numberPetrOrSergei);
        }
    }
}
