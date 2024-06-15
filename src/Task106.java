import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task106 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        File output = Path.of("output.txt").toFile();
        try (Scanner scanner = new Scanner(input);
             PrintWriter out = new PrintWriter(output)) {
            int quantity = scanner.nextInt();
            int i = 0;
            while (scanner.hasNextInt()) {
                if (scanner.nextInt() == 0) {
                    i++;
                }
            }
            int j = quantity - i;
            out.write(String.valueOf(Math.min(i, j)));
        }
    }
}
