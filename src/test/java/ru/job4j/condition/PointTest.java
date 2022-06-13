package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX11X21Y11Y21then0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        int expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10X20Y12Y20then2() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10X20Y10Y21then1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        int expected = 1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}