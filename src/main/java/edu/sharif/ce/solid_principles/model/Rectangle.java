package edu.sharif.ce.solid_principles.model;

import edu.sharif.ce.solid_principles.AreaComputable;

public class Rectangle implements AreaComputable {
    private int width;
    private int height;

    public Rectangle(int width, int height) throws IllegalArgumentException {
        checkWidth(width);
        checkHeight(height);
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        checkWidth(width);
        this.width = width;
    }

    public void setHeight(int height) {
        checkHeight(height);
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private static void checkWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative.");
        }
    }

    private static void checkHeight(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
    }

    @Override
    public int computeArea() {
        return width * height;
    }
}
