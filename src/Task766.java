import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки, и брала только те, в которых
 * ровно M орешков. Также известно, что для пропитания зимой ей необходимо не менее K орешков. Определите, хватит ли на
 * зиму орешков белочке.
 */
public class Task766 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).trim();
        String[] numbers = s.split(" ");
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }
        int n = list.get(0);
        int m = list.get(1);
        int k = list.get(2);
        if (n*m >= k) {
            Files.writeString(output, "YES");
        } else Files.writeString(output, "NO");
    }
}
