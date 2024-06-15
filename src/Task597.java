import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task597 {
    public static void main(String[] args) throws IOException {
        File input = Path.of("input.txt").toFile();
        File output = Path.of("output.txt").toFile();
        try(Scanner sc = new Scanner(input)) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int r3 = sc.nextInt();
            if (r1 >= r2 + r3) {
                Files.writeString(output.toPath(), "YES");
            } else {
                Files.writeString(output.toPath(), "NO");
            }
        }
    }
}
