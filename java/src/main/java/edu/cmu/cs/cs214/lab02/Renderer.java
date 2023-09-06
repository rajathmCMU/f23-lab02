package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer{
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    Circle circle = new Circle();
    
    // Renderer(Rectangle rectangle) {
    //     this.rectangle = rectangle;
    // }

    void draw(int num) {
        // double area = rectangle.getArea();

        // assume implementation
        rectangle.setHeight(100);

        switch (num) {
            case 1:
                double areaR = rectangle.area(rectangle.getHeight(),rectangle.getWidth(), Shape.radius);
                System.out.println("Shape printed\n" + "Its area is " + areaR);
                break;
            case 2:
                double areaS = square.area(3.44,0 , 0);
                System.out.println("Shape printed\n" + "Its area is " + areaS);
                break;
            case 3:
                double areaC = circle.area(0,0 , 5);
                System.out.println("Shape printed\n" + "Its area is " + areaC);
                break;
            default:
                System.out.println("invalid case");
                break;
        }
    }
}
