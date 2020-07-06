//14.06.2020
//Alexandr Mun
//Приветствовать любого пользователя при вводе его имени через командную строку.

package com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свое имя");
        String name = reader.readLine();
        System.out.println("Приветствую " + name);
    }
}