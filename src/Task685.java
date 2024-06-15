import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;

public class Task685 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).trim();
        String[] split = s.split(" ");
        Integer[] prices = new Integer[3];
        Integer[] sizes = new Integer[3];
        for(int i = 0; i < 3; i++) {
             prices[i] = Integer.parseInt(split[i]);
             sizes[i] = Integer.parseInt(split[i+3]);
        }
        Arrays.sort(prices, Collections.reverseOrder());
        Arrays.sort(sizes, Collections.reverseOrder());
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += prices[i] * sizes[i];
        }
        Files.writeString(output, Integer.toString(sum));
    }
}
