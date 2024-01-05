package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inputtwo = 120;
        float expectedtwo = 2;
        float outputtwo = Converter.rubleToDollar(inputtwo);
        boolean passedtwo = expectedtwo == outputtwo;
        System.out.println("140 rubles are 2. Test result : " + passedtwo);
        System.out.println("140 rubles are " + outputtwo + " dollar");
        System.out.println("140 rubles are " + output + " euro.");
    }
}