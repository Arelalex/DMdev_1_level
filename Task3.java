package com.dmdev.cs.homework.functions;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Task3 {
    public static void main(String[] args) {
        compareAreaOfTriangle(getAreaOfTriangle(5, 6), getAreaOfTriangle(4, 5));
        compareAreaOfTriangle(getAreaOfTriangle(3, 2), getAreaOfTriangle(4, 2));
        compareAreaOfTriangle(getAreaOfTriangle(7, 3), getAreaOfTriangle(7, 3));
    }

    public static double getAreaOfTriangle(int a, int b) {
        return (double) (a * b) / 2;
    }

    public static void compareAreaOfTriangle(double areaOfTriangle1, double areaOfTriangle2) {

        if (areaOfTriangle1 > areaOfTriangle2) {
            System.out.println("Первый треугольник больше второго");
        } else if (areaOfTriangle1 < areaOfTriangle2) {
            System.out.println("Первый треугольник меньше второго");
        } else {
            System.out.println("Первый треугольник равен второму");
        }
    }
}