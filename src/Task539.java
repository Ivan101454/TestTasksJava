import java.io.*;
import java.util.Scanner;

/**
 * Помогите Пете решить эту задачу, определив наименьшее число разрезов торта по заданному числу гостей.
 */
public class Task539 {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        try (Scanner scanner = new Scanner(input);
             FileWriter fileWriter = new FileWriter("output.txt");
             ) {
            int n = Integer.parseInt(scanner.next().trim());
            int result;
            if (n % 2 == 0) {
                result = n / 2;
            } else if (n == 1) {
                result = 0;
            } else {
                result = n;
            }
            fileWriter.write(String.valueOf(result));
        }
    }
}
