package edu.sharif.ce.solid_principles;

import org.junit.Assert;
import org.junit.Test;

public class SquareAreaCalculatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void initializeByNegativeSideTest() {
        new Square(-1);
    }

    @Test
    public void initialValidSquareTest() {
        var square = new Square(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setWidthByNegativeWidthTest() {
        var square = new Square(1);
        square.setSide(-1);
    }

    @Test
    public void setWidthByValidWidthTest() {
        var square = new Square(1);
        square.setSide(3);
        Assert.assertEquals(3, square.getSide());
    }

    @Test
    public void rectangleAreaCalculationTest1() {
        var side = 2;
        var square = new Square(side);
        Assert.assertEquals(side * side, square.computeArea());
    }

    @Test
    public void rectangleAreaCalculationTest2() {
        var side = 7;
        var square = new Square(side);
        Assert.assertEquals(side * side, square.computeArea());
    }
}
