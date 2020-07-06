//14.06.2020
//Alexandr Mun
//Отобразить в окне консоли аргументы командной строки в обратном порядке.

package com.mun.automated.fundamentals;

public class MainTask2 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length/2; i++) {
            String tempArgs = args[i];
            args[i] = args[args.length - 1 - i];
            args[args.length - 1 - i] = tempArgs;
        }
        for (String x : args) {
            System.out.println(x);
        }
    }
}