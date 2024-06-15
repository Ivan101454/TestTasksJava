import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * В выходной файл OUTPUT.TXT нужно вывести в точности то же число, которое задано во входном файле.
 */
public class Task108 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");

        try (Scanner sc = new Scanner(input)) {
            int info = sc.nextInt();
            int n = 10; //количество участников
            int temp = 0;
            for (int i = 0; i < n; i++) {
                temp = info;
            }
            Files.writeString(output, String.valueOf(temp));
        }
    }
}
