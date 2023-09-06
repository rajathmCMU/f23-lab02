package edu.cmu.cs.cs214.lab02.shapes;

public interface Shape {
	double height = 1;
   	double width = 1;
	double radius = 1;

	// double rectangleArea();
	// double circleArea();
	// double squareArea();
	double area(double height, double width, double radius);
}

