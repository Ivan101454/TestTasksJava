import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * В единственной строке входного файла INPUT.TXT задана единственная цифра К, соответствующая первой цифре
 * полученного Васей в результате вычитания наименьшего загаданного Васей значения из наибольшего.
 */

public class Task004 {
    public static void main(String[] args) {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = null;
        try {
            s = Files.readString(input).trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int a = Integer.parseInt(s);
        int b = 9;
        int c = 9 - a;
        int result = a*100 + b*10 + c;
        try {
            Files.writeString(output, Integer.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
