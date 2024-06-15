import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Task754 {
    public static void main(String[] args) throws IOException {
        File input = Path.of("input.txt").toFile();
        File output = Path.of("output.txt").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(output));
             Scanner scanner = new Scanner(input)) {
            int[] mas = new int[3];
            int i = 0;
            String error = "";
            while (scanner.hasNext()) {
                mas[i] = Integer.parseInt(scanner.next().trim());
                if (mas[i] > 727 || mas[i] < 94) {
                    error = "Error";
                }
                i++;
            }
            int m1 = mas[0];
            int m2 = mas[1];
            int m3 = mas[2];
            int max = Math.max(m1, Math.max(m2, m3));
            if (!error.equals("Error")) {
                fileWriter.write(Integer.toString(max));
            } else fileWriter.write(error);
        }
    }
}
