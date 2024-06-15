import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task33 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).replaceAll("\r\n", "").trim();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int sum = n + m -1;
        int nDash = sum - n;
        int mDash = sum - m;
        Files.writeString(output, nDash + " " + mDash);

    }
}
