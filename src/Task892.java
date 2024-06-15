import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Task892 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).trim();
        int n = Integer.parseInt(s);
        String answer = "";
        Season[] values = Season.values();
        if (n <= 0 || n > 12) {
            answer = "Error";
        } else {
            for (Season item : values) {
                int[] value = item.getValue();
                for (int i : value) {
                    if (i == n) {
                        String season = item.toString().toLowerCase();
                        answer = season.replace(season.substring(0, 1), season.substring(0, 1).toUpperCase());
                    }
                }
            }
        }
        Files.writeString(output, answer.trim().toString());

    }
    public enum Season {
        WINTER(12, 1, 2), SPRING(3, 4, 5), SUMMER(6, 7, 8), AUTUMN(9, 10, 11);
        int[] value;

        Season(int... value) {
            this.value = value;
        }
        public int[] getValue() {
            return value;
        }

    }
}
