//13.07.2020
//Alexandr Mun
//Ввести с консоли n - размерность матрицы a [n] [n].
//Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

package com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class optionalTask21 {
    public static void main(String[] args) throws IOException {

        int matrixDimension = 0;
        double min = -10;
        double max = 10;

        System.out.println("Введите размерность матрицы");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        matrixDimension = Integer.parseInt(reader.readLine());

        double[][] matrix = new double[matrixDimension][matrixDimension];

        for (int i = 0; i < matrix.length; i++ ) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.random() * (max - min) + min;
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length-1; j++) {
                    if (matrix[k][j] > matrix[k][j+1]) {
                        double temp = matrix[k][j];
                        matrix[k][j] = matrix[k][j+1];
                        matrix[k][j+1] = temp;
                    }
                }
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length-1; j++) {
                    if (matrix[j][k] > matrix[j+1][k]) {
                        double temp = matrix[j][k];
                        matrix[j][k] = matrix[j+1][k];
                        matrix[j+1][k] = temp;
                    }
                }
            }
        }


        print(matrix);
    }
    static void print(double matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(String.format("%.3f",matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
