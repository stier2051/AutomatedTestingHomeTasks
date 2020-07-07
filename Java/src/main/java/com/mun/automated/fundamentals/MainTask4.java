//16.06.2020
//Alexandr Mun
//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

package com.mun.automated.fundamentals;

public class MainTask4 {
    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 1;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            multiplication *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма аргументов: " + sum);
        System.out.println("Произведение аргументов " + multiplication);
    }
}
