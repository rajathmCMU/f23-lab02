package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {

    private double height = 3;
    private double width = 4;

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double area() {
        return (height*width);
    }
}
