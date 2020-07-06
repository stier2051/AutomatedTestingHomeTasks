//14.06.2020
//Alexandr Mun
//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

package com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте количество случайных чисел");
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++) {
            System.out.print(Math.random() + " ");
        }
    }
}