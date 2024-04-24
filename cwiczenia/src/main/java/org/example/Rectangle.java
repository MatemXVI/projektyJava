package org.example;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    // Metoda do obliczenia obwodu prostokąta
    public double calculatePerimeter() {
        // TODO: Uzupełnij metodę
        return 2 * length + 2 * width;
    }

    // Metoda do sprawdzenia, czy prostokąt jest kwadratem
    public boolean isSquare() {
        if(length == width){
            return true;
        }else{
            return false;
        }
    }

    // Metoda do wyświetlenia informacji o prostokącie
    public void displayInfo() {
        System.out.println("Długość: " + length);
        System.out.println("Szerokość: " + width);
        System.out.println("Pole powierzchni: " + calculateArea());
        System.out.println("Obwód: " + calculatePerimeter());
        System.out.println("Czy jest kwadratem? " + isSquare());
    }

}
