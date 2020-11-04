package ru.geekbrains.java.java1;

public class FirstApp {
    public static void main(String[] args) {                // Первое задание.
        System.out.println("Первое домашнее задание.");
    }

    static void variables() {                               // Второе задание.
        byte a = 35;
        System.out.println("Значение byte = " + a);

        int b = 666;
        System.out.println("Значение int = " + b);

        short c = -25000;
        System.out.println("Значение short = " + c);

        long d = 350000L;
        System.out.println("Значение long = " + d);

        float e = 5.33f;
        System.out.println("Значение float = " + e);

        double f = 678.876;
        System.out.println("Значение double = " + f);

        char g = 'X';
        System.out.println("Значение char = " + g);

        boolean h = true;
        System.out.println("Значение boolean = " + h);
    }

    public static int example(int a, int b, int c, int d) { // Третье задание
        return a * (b + (c / d));
    }


}

