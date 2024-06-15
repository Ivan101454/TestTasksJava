import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так,
 * чтобы среди них гарантированно были две бусины одного цвета.
 */
public class Task903 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try(Scanner sc = new Scanner(input)) {
            int n = sc.nextInt(); //количество бусин
            Files.writeString(output, String.valueOf(n+1));
        }
    }
}
