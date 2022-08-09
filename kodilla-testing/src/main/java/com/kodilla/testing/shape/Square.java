package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name = "Square";
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA);
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return Math.pow(sideA, 2);
    }
}
