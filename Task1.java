package com.dmdev.cs.homework.functions;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {
        // 0-14 первая четверть
        // 15-29 вторая четверть
        // 30-44 третья четверть
        // 45-59 четвертая четверть
        getQuarter(5);
        getQuarter(20);
        getQuarter(37);
        getQuarter(58);
        getQuarter(60);
    }

    public static void getQuarter(int minutes) {
        if (0 <= minutes && minutes <= 14) {
            System.out.println(minutes + " is first quarter");
        } else if (15 <= minutes && minutes <= 29) {
            System.out.println(minutes + " is second quarter");
        } else if (30 <= minutes && minutes <= 44) {
            System.out.println(minutes + " is third quarter");
        } else if (45 <= minutes && minutes <= 59) {
            System.out.println(minutes + " is fourth quarter");
        } else
            System.out.println(minutes + " is invalid value");
    }
}
