import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 */
public class Task193 {
    public static void main(String[] args) throws IOException {
        int n;
        int m;
        int k;
        HashMap<Integer, Rectangle> rectangles = new HashMap<>();
        File fileInput = Path.of("input.txt").toFile();
        File fileOutput = Path.of("output.txt").toFile();
        try (Scanner scanner = new Scanner(fileInput);
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileOutput))) {
            n = scanner.nextInt(); if(!(1<=n && n<=200)) {
                System.out.println("Not such number");
            }
            m = scanner.nextInt(); if(!(1<=m && m<=200)) {
                System.out.println("Not such number");
            }
            k = scanner.nextInt();
            if(!(1<=k && k<=255)) {
                System.out.println("Not such number");
            }
            for (int i = 1; i <= k; i++) {
                rectangles.put(i, new Rectangle());
            }
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(rectangles.containsKey(matrix[i][j])) {
                        Rectangle rectangle = rectangles.get(matrix[i][j]);
                        int a = Math.max(j, rectangle.x);
                        int b = Math.max(i, rectangle.y);
                        int width = i - a;
                        int height = j - b;
                        rectangle.setBounds(a, b, width, height);
                        rectangles.put(matrix[i][j], rectangle);
                    }
                }
            }

            rectangles.forEach((i, rectangle) -> {
                System.out.println(rectangle);
            });
            
            }

        }

    }

