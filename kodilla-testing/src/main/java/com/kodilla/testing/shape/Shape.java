package com.kodilla.testing.shape;

import java.util.Objects;

public class Shape implements ShapeInterface{
    private String shapeName;
    private Integer field;

    public Shape (String shapeName, Integer field){
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public Integer getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Shape:" + shapeName + ", field = " + field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(shapeName, shape.shapeName) &&
                Objects.equals(field, shape.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}
