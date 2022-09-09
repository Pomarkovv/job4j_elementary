package ru.job4j.array;

import java.io.FileOutputStream;
import java.util.Arrays;

public class Matrix {

    public static int[][] multiple(int size) {
       int[][] newArray = new int[size][size];
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               newArray[i][j] = (i + 1) * (j + 1);
           }
       }
       return newArray;
   }

    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("matrix.txt", true)) {
            out.write(Arrays.deepToString(Matrix.multiple(9)).getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

