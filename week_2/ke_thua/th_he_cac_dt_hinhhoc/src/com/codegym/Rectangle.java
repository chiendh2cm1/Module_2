package com.codegym;

public class Rectangle extends Shape {
    private double width =1.0;
    private double length =1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean fiiled, double width, double length) {
        super(color, fiiled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
     public String toString(){
        return "A Rectangle with width "
                + getWidth() +" and length "
                + getLength() + " ,which is a subclass of "
                + super.toString();
    }
}
