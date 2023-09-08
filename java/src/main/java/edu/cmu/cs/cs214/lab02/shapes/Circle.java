package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    
    double radius = 9.5;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
