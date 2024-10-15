package Task2;

public class Calcul {
            public static void main(String[] args) {
            Parallelogram parallelogram = new Parallelogram();
            //Prima metoda
            int length = 8;
            int width = 6;
            int perimeter1 = parallelogram.calculatePerimeter(length, width);
            double area1 = parallelogram.calculateArea(length, width);

            System.out.println("Perimetrul paralelogramului cu lungime = " + length + "si lățime = " + width + " este = " + perimeter1);
            System.out.println("Aria paralelogramului (lungime = " + length + ", lățime = " + width + "): " + area1);

            // A doua metoda
            int sideLength = 11;
            int perimeter2 = parallelogram.calculatePerimeter(sideLength);
            int area2 = parallelogram.calculateArea(sideLength);

            System.out.println("Perimetrul pătratului cu latura = " + sideLength + " este =" + perimeter2);
            System.out.println("Aria pătratului cu latură = " + sideLength + " este =  " + area2);
        }
    }

