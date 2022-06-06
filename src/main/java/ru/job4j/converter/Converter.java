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
        float dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollars.");
        float rubleDollar = Converter.dollarToRuble(10);
        System.out.println("10 dollars are " + rubleDollar + " rubles.");
        float rubleEuro = Converter.euroToRuble(10);
        System.out.println("10 euro are " + rubleEuro + " rubles.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inDol = 240;
        float expectedDol = 4;
        float outDol = Converter.rubleToDollar(inDol);
        boolean passedDol = expectedDol == outDol;
        System.out.println("240 rubles are 4. Test result : " + passedDol);
    }
}
