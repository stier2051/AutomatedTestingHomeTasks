//12.07.2020
//Alexandr Mun
//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

package com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalTask3 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        int sumLenghtArray = 0;
        double averageLenght = 0;

        System.out.println("Введите 10 чисел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            sumLenghtArray += String.valueOf(Math.abs(array[i])).length();
        }

        averageLenght = sumLenghtArray/array.length;

        System.out.println("Числа, длина которых меньше средней длины по всем числам и их длина:");
        for (int value : array) {
            if (String.valueOf(Math.abs(value)).length() < averageLenght) {
                System.out.print("Число " + value);
                System.out.println(", Длина " + String.valueOf(Math.abs(value)).length());
            }
        }

        System.out.println("Числа, длина которых больше средней длины по всем числам и их длина:");
        for (int value : array) {
            if (String.valueOf(Math.abs(value)).length() > averageLenght) {
                System.out.print("Число " + value);
                System.out.println(", Длина " + String.valueOf(Math.abs(value)).length());
            }
        }
    }
}
