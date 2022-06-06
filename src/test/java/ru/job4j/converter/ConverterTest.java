package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert240RblThen4Dollars() {
        float inDol = 240;
        float expectedDol = 4;
        float outDol = Converter.rubleToDollar(inDol);
        float eps = 0.0001f;
        Assert.assertEquals(expectedDol, outDol, eps);
    }

    @Test
    public void whenConvert10DolThen600Rubles() {
        float in = 10;
        float expected = 600;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert10EurThen700Rubles() {
        float in = 10;
        float expected = 700;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}