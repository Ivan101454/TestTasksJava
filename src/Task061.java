
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Входной файл INPUT.TXT содержит 4 строки, в каждой строке находится два целых числа a и b – итоговый счет в
 * соответствующей четверти. а – количество набранных очков за четверть первой командой, b – количество очков,
 * набранных за четверть второй командой. (0 ≤ a,b ≤ 100).
 */
public class Task061 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).trim();
        String s1 = s.replaceAll("\r\n", " ");
        String[] split = s1.split(" ");
        int[] mas = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            mas[i] = Integer.parseInt(split[i]);
        }
        int teamA = 0;
        int teamB = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                teamA += mas[i];
            } else teamB += mas[i];
        }
        if (teamA == teamB) {
            Files.writeString(output, "DRAW");
        } else if (teamA > teamB) {
            Files.writeString(output, "1");
        } else {
            Files.writeString(output, "2");
        }
    }
}
