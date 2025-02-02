package Task3;

import Task1.Main;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Cerc";
    }
}
