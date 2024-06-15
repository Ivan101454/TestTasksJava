import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * В выходной файл OUTPUT.TXT выведите номер курса студента, одержавшего победу в олимпиаде.
 */
public class Task942 {
    private static ArrayList<Integer> timeTasks = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Path input = Path.of("input.txt");
        Path output = Path.of("output.txt");
        try(Scanner sc = new Scanner(input)) {
            int n = sc.nextInt(); //количество задач
            while (sc.hasNextInt()) {
                timeTasks.add(sc.nextInt());
            }
            int timeFifth = 0;
            int timeThird = 0;
            int timeFirst = 0;
            int fifth = 5;
            int third = 3;
            int first = 1;
            Map<Integer, Integer> students = new HashMap<>();
            int temp = 0;

            int maxTime = 300;
            for (int i = 0; i < n; i++) {
                timeFifth += timeTasks.get(i) + temp;
                temp += timeTasks.get(i);
            }
            students.put(fifth, timeFifth);
            temp = 0;
            Collections.reverse(timeTasks);
            for (int i = 0; i < n; i++) {
                timeThird += timeTasks.get(i) + temp;
                temp += timeTasks.get(i);
            }
            students.put(third, timeThird);

            Collections.sort(timeTasks);
            temp = 0;
            for (int i = 0; i < n; i++) {
                timeFirst += timeTasks.get(i) + temp;
                temp += timeTasks.get(i);
            }
            students.put(first, timeFirst);


            if (students.get(fifth) < students.get(third) && students.get(fifth) == students.get(first)) {
                Files.writeString(output, String.valueOf(first));
            }
            if (students.get(fifth) == students.get(third) && students.get(fifth) == students.get(first)) {
                Files.writeString(output, String.valueOf(first));
            }
            if (students.get(fifth) == students.get(third) && students.get(fifth) < students.get(first)) {
                Files.writeString(output, String.valueOf(third));
            }

            if (students.get(fifth) < students.get(third) && students.get(fifth) < students.get(first)) {
                Files.writeString(output, String.valueOf(fifth));
            }
            if (students.get(third) < students.get(fifth) && students.get(third) < students.get(first)) {
                Files.writeString(output, String.valueOf(third));
            }
            if (students.get(first) < students.get(third) && students.get(first) < students.get(fifth)) {
                Files.writeString(output, String.valueOf(first));
            }

        }
    }


}
