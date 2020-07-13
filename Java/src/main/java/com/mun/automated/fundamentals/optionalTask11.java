//11.07.2020
//Alexandr Mun
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

package com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class optionalTask11 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        int longest = 0;
        int shortest = 1;
        int longNumber = 0;
        int shortNumber = 0;


        System.out.println("Введите 10 чисел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            int lengthNumber = String.valueOf(Math.abs(array[i])).length();
            if (lengthNumber > longest) {
                longest = lengthNumber;
                longNumber = array[i];
            }
            if (lengthNumber <= shortest) {
                shortest = lengthNumber;
                shortNumber = array[i];
            }
        }
        System.out.println("Самое короткое число: " + shortNumber + ", длина: " + shortest);
        System.out.println("Самое длинное число: " + longNumber + ", длина: " + longest);
    }
}