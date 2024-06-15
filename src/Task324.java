import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task324 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).trim();
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        if (s.equals(result)) {
            Files.writeString(output, "YES");
        } else Files.writeString(output, "NO");
        System.out.println(result);
    }
}
