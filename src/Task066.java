import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task066 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String symbols = "qwertyuiopasdfghjklzxcvbnm";
        String s = Files.readString(input).trim().toLowerCase();
        Files.writeString(output, find(s, symbols));
    }

    private static String find(String s, String symbols) {
        String result ="q";
        for (int i = 0; i <symbols.length() - 1; i++) {
            if (s.equals(String.valueOf(symbols.charAt(i)))) {
                result = String.valueOf(symbols.charAt(i + 1));
            }
        }
        return result;
    }
}
