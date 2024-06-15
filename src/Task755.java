import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Требуется определить: сколько ягод ребята собрали в результате, при этом следует проверить, не ошиблись ли мы в
 * расчетах, подсчитывая количество съеденных ягод (их не должно было получиться больше, чем сорванных ягод).
 */
public class Task755 {
    public static void main(String[] args) throws IOException {
        try (FileWriter fileWriter = new FileWriter("output.txt");
             FileReader fileReader = new FileReader("input.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String s = bufferedReader.readLine().trim();
            String[] split = s.split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            int z = Integer.parseInt(split[2]);
            int result = x + y - z;
            if ((x + y) < z) {
                fileWriter.write("Impossible");
            } else {
                fileWriter.write(String.valueOf(result));
            }
        }
    }
}
