import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task757 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try(Scanner sc = new Scanner(input)) {
            long c = Long.parseLong(sc.next().trim());
            long h = Long.parseLong(sc.next().trim());
            long o = Long.parseLong(sc.next().trim());
            long count = 0;
//            while (c >= 2 && h >= 6 && o >= 1) {
//                c -= 2;
//                h -= 6;
//                o -= 1;
//                count += 1;
//            }
            c /= 2;
            h /= 6;
            count = Math.min(c, Math.min(h, o));
            Files.writeString(output, Long.toString(count));
        }
    }
}
