import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;

public class Task149 {
    public static void main(String[] args) throws IOException {
        File input = Path.of("input.txt").toFile();
        File output = Path.of("output.txt").toFile();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            String s = bufferedReader.readLine().trim();
            String[] split = s.split(" ");
            String[] revers = new String[n];
            for (int i = 0; i < n; i++) {
                revers[i] = split[n - 1 - i];
            }
            StringBuilder res = new StringBuilder(new String());
            for (int i = 0; i < n; i++) {
                res.append(revers[i]).append(" ");
            }
            bufferedWriter.write(res.toString());

//            StringBuilder stringBuilder = new StringBuilder(s);
//            String reverse = stringBuilder.reverse().toString();
//            bufferedWriter.write(reverse);
        }
    }
}
