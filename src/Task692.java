import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class Task692 {
    public static void main(String[] args) throws IOException {
        String result = "";
        Path input = Path.of("input.txt");
        File output = Path.of("output.txt").toFile();
        try (Scanner sc = new Scanner(input);
             PrintWriter printWriter = new PrintWriter(output)) {
            int i = Integer.parseInt(sc.next().trim());
            int j = 1;
            while (i >= j) {
                if (j == i) {
                    result = "YES";
                }
                j = j*2;
            }
            if (result.isEmpty()) {
                result = "NO";
            }
            printWriter.write(result);
        }
    }
}
