package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] age = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Кирилл";
        names[1] = "Алиса";
        names[2] = "Артем";
        names[3] = "Ксюша";
        System.out.println(names[0] + "\n" + names[1] + "\n" + names[2] + "\n" + names[3]);
        System.out.println("Размер массива равен: " + age.length);
        System.out.println("Размер массива равен: " + surname.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
