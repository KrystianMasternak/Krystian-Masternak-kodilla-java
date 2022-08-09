package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0 && Double.compare(triangle.sideB, sideB) == 0 && Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    public String getShapeName() {
        return name;
    }


    public double getField() {
        double halfTheCircumference = getHalfTheCircumference();
        return Math.sqrt(halfTheCircumference * (halfTheCircumference - sideA) * (halfTheCircumference - sideB) * (halfTheCircumference - sideC));
    }

    public double getHalfTheCircumference() {
        return (sideA + sideB + sideC)  / 2;
    }


}
