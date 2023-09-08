package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer{
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    Circle circle = new Circle();
    
    void draw(int num) {

        // assume implementation
        rectangle.setHeight(100);

        switch (num) {
            case 1:
                double areaR = rectangle.area();
                System.out.println("Shape rect printed\n" + "Its area is " + areaR);
                break;
            case 2:
                double areaS = square.area();
                System.out.println("Shape square printed\n" + "Its area is " + areaS);
                break;
            case 3:
                double areaC = circle.area();
                System.out.println("Shape circle printed\n" + "Its area is " + areaC);
                break;
            default:
                System.out.println("invalid case");
                break;
        }
    }
}
