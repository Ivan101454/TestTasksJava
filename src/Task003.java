import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) throws IOException {
        File input = Path.of("input.txt").toFile();
        try (Scanner scanner = new Scanner(input);
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            String s = scanner.next().trim();
            int length = s.length();
            if (length > 1) {
                int numberFirst = Integer.parseInt(s.substring(0, length - 1));
                int numberSecond = numberFirst + 1;
                int result = numberSecond * numberFirst;
                String resultString = result + "25";
                bufferedWriter.write(resultString);
            } else bufferedWriter.write("25");
        }
    }
}
