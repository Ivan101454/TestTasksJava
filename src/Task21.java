import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task21 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).trim();
        String[] split = s.split(" ");
        List<String> list = List.of(split);

        int min = list.stream().mapToInt(Integer::valueOf).min().getAsInt();
        int max = list.stream().mapToInt(Integer::parseInt).max().getAsInt();
        int diff = max - min;
        Files.writeString(output, String.valueOf(diff));
    }
}
