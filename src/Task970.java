import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task970 {
    public static void main(String[] args) throws IOException {
        File input = Path.of("input.txt").toFile();
        File output = Path.of("output.txt").toFile();
        try (Scanner sc = new Scanner(input);
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            if (a1 + a2 == a3 || a3 + a2 == a1 || a3 + a1 == a2) {
                bufferedWriter.write("YES");
            } else {
                bufferedWriter.write("NO");
            }
        }
    }
}
