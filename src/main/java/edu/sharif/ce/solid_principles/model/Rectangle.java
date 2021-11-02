package edu.sharif.ce.solid_principles.model;

import edu.sharif.ce.solid_principles.AreaComputable;

public class Rectangle implements AreaComputable {
    public Rectangle(int width, int height) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setWidth(int width) {
        throw new UnsupportedOperationException();
    }

    public void setHeight(int height) {
        throw new UnsupportedOperationException();
    }

    public int getWidth() {
        throw new UnsupportedOperationException();
    }

    public int getHeight() {
        throw new UnsupportedOperationException();
    }

    private static void checkWidth(int width) {
        throw new UnsupportedOperationException();
    }

    private static void checkHeight(int height) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int computeArea() {
        throw new UnsupportedOperationException();
    }
}
