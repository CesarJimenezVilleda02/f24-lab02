package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    public Shape targetShape;
    
    Renderer(Shape targetShape) {
        this.targetShape = targetShape;
    }

    void draw() {
        double area = targetShape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
