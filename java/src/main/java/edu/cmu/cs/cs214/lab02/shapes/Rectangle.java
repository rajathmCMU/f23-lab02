package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    // public double height;
    // public double width;
    
    // public Rectangle(double height, double width){
    //     this.height = height;
    //     this.width = width;
    // }

    // public double getArea() {
    //     return height * width;
    // }

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
    public double Area(double height, double width, double radius) {
        return (this.height*this.width);
    }
}
