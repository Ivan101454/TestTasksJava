//package com.ivan101454;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Заданы координаты x0 и y0 цели в начальный момент времени, а также вектор (Vx; Vy) ее скорости.
 * Считается, что цель движется равномерно и прямолинейно. В начальный момент времени РК-2000 находится в начале координат.
 * Его максимальная скорость равна V.
 *
 * Необходимо выяснить, может ли РК-2000 через заданное время t оказаться ровно на заданном расстоянии d от цели.
 * Для простоты считайте, что РК-2000 может мгновенно изменять свою скорость.
 */
public class Task492 {
    public static void main(String[] args) throws IOException {
        File fileInput = Path.of("input.txt").toFile();
        File fileOutput = Path.of("output.txt").toFile();
        try (Scanner scanner = new Scanner(fileInput);
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileOutput))) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<3; i++) {
                 sb.append(scanner.nextLine());
                 sb.append(' ');
            }
            String[] input = sb.toString().trim().split(" ");
            double x0 = Double.parseDouble(input[0]); // координата x цели в начальный момент времени
            double y0 = Double.parseDouble(input[1]); // координата y цели в начальный момент времени
            double Vx = Double.parseDouble(input[2]); // скорость по оси x цели
            double Vy = Double.parseDouble(input[3]); // скорость по оси y цели
            double V = Double.parseDouble(input[4]); // максимальная скорость РК-2000
            double t = Double.parseDouble(input[5]); // время
            double d = Double.parseDouble(input[6]); // расстояние от РК-2000 до цели

            double xT = x0 + Vx*t; // координата X цели в момент t
            double yT = y0 + Vy*t; // координата Y цели в момент t
            double distance = Math.sqrt(Math.pow(xT,2) + Math.pow(yT,2)); // расстояние через время t от начала координат
            double distanceDiff = distance - V*t; // разница расстояния с текущим положением крейсера
            if (distanceDiff <= d) {
                printWriter.write("YES");
            } else {
                printWriter.write("NO");
            }
        }
    }
}
