package edu.sharif.ce.solid_principles.model;

import edu.sharif.ce.solid_principles.AreaComputable;

public class Square implements AreaComputable {
    public Square(int side) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setSide(int side) {
        throw new UnsupportedOperationException();
    }

    public int getSide() {
        throw new UnsupportedOperationException();
    }

    private static void checkSide(int side) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int computeArea() {
        throw new UnsupportedOperationException();
    }
}
