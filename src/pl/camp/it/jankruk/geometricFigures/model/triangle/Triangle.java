package pl.camp.it.jankruk.geometricFigures.model.triangle;

import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;

public class Triangle implements GeometricFigure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculatePerimeter() {
        return this.a+this.b+this.c;
    }

    @Override
    public double calculateArea() {
        double halfPeri = ((double) calculatePerimeter()/2);
        return Math.sqrt(halfPeri*(halfPeri-this.a)*(halfPeri-this.b)*(halfPeri-c));
    }

    @Override
    public boolean checkIfFigureCorrect() {
        return a + b > c && a + c > b && c + b > a;
    }
    @Override
    public String toString(){
        if (checkIfFigureCorrect()){
        return  getClass().getSimpleName() + " - sides: " + this.a +
                ", " + this.b + ", " + this.c + " - perimeter: " +
                calculatePerimeter() + " - area: " + String.format("%.2f",calculateArea());
        } else {
            return this.a + ", " + this.b + ", " + this.c + " - from these sides you can't create "
                    +getClass().getSimpleName();
        }
    }
}
