package edu.sharif.ce.solid_principles.model;

import edu.sharif.ce.solid_principles.AreaComputable;

public class Square implements AreaComputable {
    private int side;

    public Square(int side) throws IllegalArgumentException {
        checkSide(side);
        this.side = side;
    }

    public void setSide(int side) {
        checkSide(side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    private static void checkSide(int side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side cannot be negative.");
        }
    }

    @Override
    public int computeArea() {
        return side * side;
    }
}
