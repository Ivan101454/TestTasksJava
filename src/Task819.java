import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task819 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try(Scanner scanner = new Scanner(input)) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            long c = scanner.nextInt();
            long s = 2*(a*c + a*b + b*c);
            long v = a*b*c;
            Files.writeString(output, (s + " " + v).trim());
        }
    }
}
