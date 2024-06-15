import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task25 {
    static int a;
    static int b;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        list = new ArrayList<>();
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input);
        s.trim();
        String[] split = s.split("\r\n");
        for (String string : split) {
            list.add(Integer.parseInt(string));
        }
        a = list.get(0);
        b = list.get(1);

        if (a == b) {
            Files.writeString(output, "=");
        } else {
            int min = Math.min(a, b);
            if (min == a) {
                Files.writeString(output, "<");
            }
            if (min == b) {
                Files.writeString(output, ">");
            }
        }

    }
}

