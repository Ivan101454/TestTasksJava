import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;


public class Task035 {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
//        Files.readString(input);
        String[] strings = Files.readString(input).trim().replace("\r\n", " ").split(" ");
        int k = Integer.parseInt(strings[0]);
        long[] longsN = new long[k];
        long[] longsM = new long[k];
        int j = 1;
        for (int i = 0; i < 2; i++) {
            longsN[i] = Long.parseLong(strings[j++]);
            longsM[i] = Long.parseLong(strings[j++]);
        }
        long[] longsD = new long[k];
        for (int i = 0; i < k; i++) {
            longsD[i] = 19*longsM[i] + (longsN[i] + 239)*(longsN[i] + 366) / 2;
        }
        String res = null;
        for (int i = 0; i < k; i++) {
            if (res != null) {
                res = String.format("%s%s",
                        res,
                        "{0}\n",
                        longsD[i]);
            } else {
                res = longsD[i] + "\n";
            }
        }
        Files.writeString(output, res);
    }
}
