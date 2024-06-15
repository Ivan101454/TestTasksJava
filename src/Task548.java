//package com.ivan101454;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Требуется написать программу, которая из цифр двух натуральных чисел создает наименьшее возможное число,
 * сохраняя при этом порядок следования цифр в этих числах.
 */

public class Task548 {
    public static void main(String[] args) throws IOException {
        File fileInput = Path.of( "input.txt").toFile();
        File fileOutput = Path.of("output.txt").toFile();
        try (Scanner scanner = new Scanner(fileInput);
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileOutput))) {
            String numberA = scanner.nextLine().trim();
            String numberB = scanner.nextLine().trim();
            String numberC = displayResultNumber(numberA, numberB);
            printWriter.write(numberC);
        }
    }

    public static String displayResultNumber(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        char[] charArrayA = num1.toCharArray();
        char[] charArrayB = num2.toCharArray();
        List<Integer> arrayA = new ArrayList<>();
        List<Integer> arrayB = new ArrayList<>();
        for (Character c : charArrayA) {
            arrayA.add(Integer.parseInt(c.toString()));
        }
        for (Character c : charArrayB) {
            arrayB.add(Integer.parseInt(c.toString()));
        }
        int countA = 0;
        int countB = 0;
        int sizeA = arrayA.size();
        int sizeB = arrayB.size();

        for (int i = 0; i < (sizeA + sizeB); i++) {
            if (arrayA.size() > countA && arrayB.size() > countB) {
                if (arrayA.get(countA) < arrayB.get(countB)) {
                    result.append(arrayA.get(countA));
                    countA++;
                    continue;
                }

                if (arrayA.get(countA) > arrayB.get(countB)) {
                    result.append(arrayB.get(countB));
                    countB++;
                    continue;
                }
            }

            if (arrayA.size() > countA && arrayB.size() <= countB) {
                result.append(arrayA.get(countA));
                countA++;
            }

            if (arrayB.size() > countB && arrayA.size() <= countA) {
                result.append(arrayB.get(countB));
                countB++;
            }

            if (arrayA.size() < countA && arrayB.size() < countB) {
                break;
            }
        }
        return result.toString();
    }
}
