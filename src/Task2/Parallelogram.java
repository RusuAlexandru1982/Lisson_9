package Task2;

public class Parallelogram {
    // Metoda pentru calculul perimetrului
    public int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    public int calculatePerimeter(int sideLength) {
        return 4 * sideLength;
    }

    // Metoda pentru calculul ariei
    public double calculateArea(int length, double width) {
        return length * width;
    }


    public int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }
}
