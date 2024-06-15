import java.io.*;
import java.nio.file.Path;

public class Task008 {
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int c;
        File input = new File("input.txt");
        File output = Path.of("output.txt").toFile();
        try (FileInputStream fis = new FileInputStream(input);
             FileOutputStream fos = new FileOutputStream(output)) {
            byte[] inputBytes = fis.readAllBytes();
            String s = new String(inputBytes).trim();
            String[] split = s.split(" ");
            a = Integer.parseInt(split[0]);
            b = Integer.parseInt(split[1]);
            c = Integer.parseInt(split[2]);
            if (a*b != c) {
                fos.write("NO".getBytes());
            } else fos.write("YES".getBytes());
        }
    }
}

