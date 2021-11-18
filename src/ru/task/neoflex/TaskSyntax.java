package ru.task.neoflex;

import java.util.Random;

public class TaskSyntax {
    byte b = 127;
    short sh = 32767;
    int i = 2147483647;
    long l = 9223300060000000l;
    float f = 12.23f;
    double d = 123.123;
    char ch = 'd';
    boolean bool = true;
    String name = "name";

    public int mathematical(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public boolean range(int a, int b) {
        int c = a + b;
        return 10 > c & c <= 20;
    }

    public void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else { System.out.println("Отрицательное"); }
    }

    public boolean checkNegative(int a) {
        return a < 0;
    }

    public void helloName(String a) {
        System.out.printf("Привет, %s!", a);
    }

    public void leapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Високосный год");
        } else if (year % 100 == 0) {
            System.out.println("Невисокосный год ");
        } else if (year % 4 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год ");
        }
    }

    public static void main(String[] args) {
    }
}
