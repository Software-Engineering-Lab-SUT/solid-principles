package edu.sharif.ce.solid_principles;

import edu.sharif.ce.solid_principles.model.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleAreaCalculatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void initializeByNegativeWidthTest() {
        new Rectangle(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void initializeByNegativeHeightTest() {
        new Rectangle(1, -2);
    }

    @Test
    public void initialValidRectangleTest() {
        var rectangle = new Rectangle(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setWidthByNegativeWidthTest() {
        var rectangle = new Rectangle(1, 2);
        rectangle.setWidth(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHeightByNegativeHeightTest() {
        var rectangle = new Rectangle(1, 2);
        rectangle.setHeight(-2);
    }

    @Test
    public void setWidthByValidWidthTest() {
        var rectangle = new Rectangle(1, 2);
        rectangle.setWidth(3);
        Assert.assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void setHeightByValidHeightTest() {
        var rectangle = new Rectangle(1, 2);
        rectangle.setHeight(3);
        Assert.assertEquals(3, rectangle.getHeight());
    }

    @Test
    public void rectangleAreaCalculationTest1() {
        var width = 2;
        var height = 2;
        var rectangle = new Rectangle(width, height);
        Assert.assertEquals(width * height, rectangle.computeArea());
    }

    @Test
    public void rectangleAreaCalculationTest2() {
        var width = 7;
        var height = 13;
        var rectangle = new Rectangle(width, height);
        Assert.assertEquals(width * height, rectangle.computeArea());
    }
}
