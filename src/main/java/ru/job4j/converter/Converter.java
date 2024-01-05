package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        boolean passed = expected == output;

        float input2 = 140;
        float expected2 = 2;
        float output2 = Converter.rubleToEuro(input2);
        boolean passed2 = expected2 == output2;

        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);

        System.out.println("180 rubles are 3. Test result = " + passed);
        System.out.println("180 rubles are 2. Test result = " + passed2);

        System.out.println("180 rubles are 3 " + dollar + " dollar");
        System.out.println("140 rubles are 2 " + euro + " euro.");
    }
}