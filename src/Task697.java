import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task697 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try(Scanner scanner = new Scanner(input)) {
            double l = Double.parseDouble(scanner.next().trim());
            double w = Double.parseDouble(scanner.next().trim());
            double h = Double.parseDouble(scanner.next().trim());
            double n = (l*h + w*h)*2/16;
            int m = (int) n;
            if (n <= 1) {
                n = 1;
            }
            if (!((n - m) == 0)) {
                n = m + 1;
            }
            Files.writeString(output, Integer.toString((int) n));
        }
    }
}
