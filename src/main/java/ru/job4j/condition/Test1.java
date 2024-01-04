package ru.job4j.converter;

public class Test1 {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 180;
        float expected = 3;
        float output = Test1.rubleToDollar(input);
        boolean passed = expected == output;
        float euro = ru.job4j.converter.Converter.rubleToEuro(180);
        System.out.println("180 rubles are 3. Test result = " + passed);
        System.out.println("180 rubles are 3 " + output + " dollar");
    }
}