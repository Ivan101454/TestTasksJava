import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task854 {
    private static final String HEAT = "heat";
    private static final String FREEZE = "freeze";
    private static final String AUTO = "auto";
    private static final String FAN = "fan";

    public static void main(String[] args) throws IOException {

        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try (Scanner scanner = new Scanner(input)) {
            int tRoom = Integer.parseInt(scanner.next().trim());
            int tCond = Integer.parseInt(scanner.next().trim());
            String mode = scanner.next().trim();
            int res = 0;
            System.out.println(res);
            switch (mode) {
                case HEAT -> {
                    res = Math.max(tRoom, tCond);
                }
                case FREEZE -> {
                    res = Math.min(tRoom, tCond);
                }
                case AUTO -> res = tCond;
                case FAN -> res = tRoom;
            }
            Files.writeString(output, Integer.toString(res));
        }
    }
}
