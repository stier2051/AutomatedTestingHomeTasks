//12.07.2020
//Alexandr Mun
//Вывести числа в порядке возрастания (убывания) значений их длины.

package com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalTask2 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        int lenghtNumber1 = 0;
        int lenghtNumber2 = 0;

        System.out.println("Введите 10 чисел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length-1; j++) {
                lenghtNumber1 = String.valueOf(Math.abs(array[j])).length();
                lenghtNumber2 = String.valueOf(Math.abs(array[j+1])).length();
                if (lenghtNumber1 > lenghtNumber2) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("В порядке возрастания длины числа:");
        print(array);

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length-1; j++) {
                lenghtNumber1 = String.valueOf(Math.abs(array[j])).length();
                lenghtNumber2 = String.valueOf(Math.abs(array[j+1])).length();
                if (lenghtNumber1 < lenghtNumber2) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("В порядке убывания длины числа:");
        print(array);
    }
    static void print (int array[]) {
        for (int x : array) {
            System.out.println(x);
        }
    }
}
