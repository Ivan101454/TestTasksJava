import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task529 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try(Scanner scanner = new Scanner(input)) {
            double x1 = Double.parseDouble(scanner.next().trim());
            double y1 = Double.parseDouble(scanner.next().trim());
            double x2 = Double.parseDouble(scanner.next().trim());
            double y2 = Double.parseDouble(scanner.next().trim());
            double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            Files.writeString(output, String.valueOf(length));
        }
    }
}
