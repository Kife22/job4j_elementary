package ru.job4j.calculator;
import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double subtractAndDivided(double first, double second) {
        return MathFunction.subtract(first, second) + MathFunction.divided(first, second);
    }

    public static double sumAllFunction(double first, double secend) {
        return MathFunction.multiply(first, secend) + MathFunction.sum(first, secend)
               + MathFunction.subtract(first, secend) + MathFunction.divided(first, secend);
    }

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}

