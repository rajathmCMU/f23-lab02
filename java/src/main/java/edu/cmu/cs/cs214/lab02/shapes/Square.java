package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {

    double side = 5;

    @Override
    public double area() {
        return (side*side);
    }
}
