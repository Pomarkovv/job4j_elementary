package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float usd = value * 60;
        return usd;
    }

    public static float euroToRuble(float value) {
        float eur = value * 70;
        return eur;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(170);
        System.out.println("170 rubles are " + dollar + " dollars.");
        float rubleDollar = Converter.dollarToRuble(10);
        System.out.println("10 dollars are " + rubleDollar + " rubles.");
        float rubleEuro = Converter.euroToRuble(10);
        System.out.println("10 euro are " + rubleEuro + " rubles.");

    }
}
