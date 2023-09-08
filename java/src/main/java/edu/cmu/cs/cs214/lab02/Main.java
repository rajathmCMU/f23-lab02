package edu.cmu.cs.cs214.lab02;

// import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {

        Renderer renderer = new Renderer();
        /*
         * Case 1 : rectangle
         * Case 2 : square
         * Case 3 : circle
         */
        renderer.draw(1);
        renderer.draw(2);
        renderer.draw(3);
    }
}
