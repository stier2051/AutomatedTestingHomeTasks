//18.05.2020
//Alexandr Mun
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

package com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalTask1 {
    public static void main(String[] args) throws IOException {

        int max = 0;
        int[] array = new int[10];

        System.out.println("Введите 10 чисел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (array[i] > max) {
                max = array[i];
            }
        }
    }
}