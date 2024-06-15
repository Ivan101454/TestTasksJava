import java.io.*;
import java.nio.file.Path;
import java.util.*;


/**
 * Заданы три числа: a, b, c. Необходимо выяснить, можно ли так переставить цифры в числах a и b,
 * чтобы в сумме получилось c.
 */

public class Task346 {

    public static void main(String[] args) throws IOException {
        String numberA;
        String numberB;
        String numberC;

        File fileInput = Path.of("input.txt").toFile();
        File fileOutput = Path.of("output.txt").toFile();
        try (Scanner scanner = new Scanner(fileInput);
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileOutput))) {
            String input = scanner.nextLine();
            String[] s = input.trim().split(" ");
            if (s.length != 3) {
                System.out.println("В файле неверное количество данных");
            }
            numberA = s[0];
            numberB = s[1];
            numberC = s[2];
            char[] charArrayA = numberA.toCharArray();
            char[] charArrayB = numberB.toCharArray();
            Arrays.sort(charArrayA);
            Arrays.sort(charArrayB);
            int a = Integer.parseInt(new String(charArrayA));
            int c = Integer.parseInt(numberC);
            int bDash = c - a;
            ArrayList<Integer> list = new ArrayList<>();
            boolean flag = false;
            list = writeAllRecursive(charArrayB.length, charArrayB, bDash, list);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 1) {
                    printWriter.write("YES" + "\n");
                    printWriter.write(a + " " + bDash + "\n");
                    break;
                } else flag = true;
            }
            if(flag) {
                printWriter.write("NO" + "\n");
            }

        }
    }
    public static ArrayList writeAllRecursive(
            int n, char[] elements, int bDash, ArrayList<Integer> list) {
        if (n == 1) {
            list.add(checkArray(elements, bDash));
        }
        if (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                writeAllRecursive(n - 1, elements, bDash, list);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            writeAllRecursive(n - 1, elements, bDash, list);
        }
        return list;
    }

    private static void swap(char[] elements, int a, int b) {
        char tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

    private static int checkArray(char[] elements, int bDash) {
        int bResult = Integer.parseInt(new String(elements));
        if (bDash == bResult) {
            return 1;
        } else return 0;
    }
}






