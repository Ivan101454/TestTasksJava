import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task773 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).replaceAll("[\r\n]", "");
        String[] strings = s.split(" ");
        int k = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int result = (int) (Math.pow(k, 2) * m);
        Files.writeString(output, String.valueOf(result));
    }
}
