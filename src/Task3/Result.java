package Task3;

public class Result {
    public static void main(String[] args) {
        // 2 dimensiuni
        TwoDimensionalShape circle = new Circle(35);
        TwoDimensionalShape square = new Square(14);

        System.out.println(circle.getName() + " - Aria: " + circle.calculateArea());
        System.out.println(square.getName() + " - Aria: " + square.calculateArea());

        // 3 dimensiuni
        ThreeDimensionalShape sphere = new Sphere(55);
        ThreeDimensionalShape cube = new Cube(24);

        System.out.println(sphere.getName() + "  Aria = " + sphere.calculateArea() + " si Volum = " + sphere.calculateVolume());
        System.out.println(cube.getName() + " are Aria = " + cube.calculateArea() + " si Volum = " + cube.calculateVolume());
    }
}
