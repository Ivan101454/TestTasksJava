import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Требуется получить точное значение частного А/В для двух натуральных чисел A и B.
 */

public class Task109 {
    public static void main(String[] args) throws IOException {
        File fileInput = Path.of("input.txt").toFile();
        File fileOutput = Path.of("output.txt").toFile();
        try (Scanner scanner = new Scanner(fileInput);
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileOutput))) {
            String input = scanner.nextLine();
            String[] s = input.trim().split("/");
            BigDecimal bd1 = new BigDecimal(s[0]);
            BigDecimal bd2 = new BigDecimal(s[1]);
            BigDecimal bd3 = bd1.divide(bd2, 40, BigDecimal.ROUND_HALF_UP);

            String resultDivide = String.valueOf(bd3);
            StringBuilder sb = new StringBuilder();
            char[] charArray = resultDivide.toCharArray();
            ArrayList<Character> charList = new ArrayList<>();
            ArrayList<Integer> intList = new ArrayList<>();

            for (char c : charArray) {
                charList.add(c);
            }
            int startFraction = 0;
            for (int i = 0; i < charList.size(); i++) {
                sb.append(charList.get(i));
                if (charList.get(i) == '.') {
                    startFraction = i + 1;
                    break;
                }
            }
            for(int i = startFraction; i < charList.size(); i++) {
                intList.add(Integer.parseInt(String.valueOf(charList.get(i))));
            }

            int[] dataMas = matchFind(startFraction, intList);
            int c = Math.abs(startFraction - dataMas[0] + 2);

            sb.append('(');
            for (int i = dataMas[0]+2; i < dataMas[1]+2; i++) {
                sb.append(charList.get(i));
            }
            sb.append(')');
            printWriter.write(sb.toString());
        }
    }

    public static int[] matchFind(int startFraction, ArrayList<Integer> intList) {

        int[] dataMas = new int[3];
        int lengthBetweenMatch = 0;
        int firstPoint = 0;
        int secondPoint = 0;
        boolean endLoop = false;
        int q = intList.get(0);
        int w = intList.get(1);
        for (int k = 2; k < intList.size(); k++) {
            if (intList.get(k) == q && intList.get(k + 1) == w && !endLoop) {
                firstPoint = k;
                endLoop = true;
                continue;
            }
            if (intList.get(k) == q && intList.get(k + 1) == w && endLoop) {
                secondPoint = k;
                lengthBetweenMatch = secondPoint - firstPoint;
                break;
            }
        }
        dataMas[0] = firstPoint;
        dataMas[1] = secondPoint;
        dataMas[2] = lengthBetweenMatch;
        return dataMas;
    }
}


