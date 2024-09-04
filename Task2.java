package com.dmdev.cs.homework.functions;

/**
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 */

public class Task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operationPlus = '+';
        char operationMinus = '-';
        char operationMultiply = '*';
        char operationDivide = '/';
        char operationDivideWithRemainder = '%';
        char operationInvalid = '^';
        System.out.println(getResult(operand1, operand2, operationPlus));
        System.out.println(getResult(operand1, operand2, operationMinus));
        System.out.println(getResult(operand1, operand2, operationMultiply));
        System.out.println(getResult(operand1, operand2, operationDivide));
        System.out.println(getResult(operand1, operand2, operationDivideWithRemainder));
        System.out.println(getResult(operand1, operand2, operationInvalid));
    }

    public static double getResult(double operand1, double operand2, char operation) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            case '%' -> operand1 % operand2;
            default -> Double.NaN;
        };
    }
}