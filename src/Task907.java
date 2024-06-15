import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class Task907 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = Path.of("input.txt").toFile();
        File output = Path.of("output.txt").toFile();
        try(Scanner sc = new Scanner(input);
        PrintWriter pw = new PrintWriter(output)) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int r = sc.nextInt();
            if(2*r <= w && 2*r <= h) {
                pw.println("YES");
            } else pw.println("NO");
        }
    }
}
