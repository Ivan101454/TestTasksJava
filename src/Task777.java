import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task777 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
//        String[] str = Files.readString(input).trim().split(" ");
        try(Scanner scanner = new Scanner(input)) {
            int s = Integer.parseInt(scanner.next().trim());
            int t = Integer.parseInt(scanner.next().trim());
            int res = 0;
            if (s < t) {
                res = t - s;
            } else  {
            res = 12 - s + t;
        }

            Files.writeString(output, String.valueOf(res));
        }
    }
}
