package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX11X21Y11Y21then0() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        int expected = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10X20Y12Y20then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10X20Y10Y21then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 1;
        int expected = 1;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}