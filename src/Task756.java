import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task756 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try (Scanner scanner = new Scanner(input)) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            String answer = "";

            answer = Integer.toString((m - 1) * (n -1));

            Files.writeString(output, answer);
        }

    }
}
