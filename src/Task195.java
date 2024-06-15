import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class Task195 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        String s = Files.readString(input).replaceAll("[\r\n]", "");
        ArrayList<Integer> list = new ArrayList<>();
        String[] strings = s.split(" ");
        for (String string : strings) {
            list.add(Integer.parseInt(string));
        }
        int n = list.get(0);
        int a = list.get(1);
        int b = list.get(2);
        int result = a*b*n*2;
        Files.writeString(output, String.valueOf(result));
    }
}
