package ru.job4j.condition;

public class TriangleArea {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - b) * (p - c) * (p - a));
        return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}