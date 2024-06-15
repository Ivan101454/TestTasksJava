import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Требуется сложить два целых числа А и В.
 */
public class Task001 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try(Scanner sc = new Scanner(input)) {
            int a = 0;
            int b = 0;
            while(sc.hasNextInt()) {
                a = sc.nextInt();
                b = sc.nextInt();
            }
            Files.writeString(output, String.valueOf(a + b));
        }
    }
}
