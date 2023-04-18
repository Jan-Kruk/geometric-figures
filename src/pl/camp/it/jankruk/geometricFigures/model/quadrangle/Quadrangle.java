package pl.camp.it.jankruk.geometricFigures.model.quadrangle;

import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;

public class Quadrangle implements GeometricFigure {
    private int a;
    private int b;
    private int c;
    private int d;

    public Quadrangle(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public int calculatePerimeter() {
        return a+b+c+d;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public boolean checkIfFigureCorrect() {
        return a+b+c > d && a+d+c >b && a+d+b >c && c+d+b>a;
    }

    @Override
    public String toString() {
        if (checkIfFigureCorrect()){
        return getClass().getSimpleName() + " - sides: " + this.a +
                ", " + this.b + ", " + this.c + ", " + this.d +" - perimeter: " +
                calculatePerimeter() + " - area: " + "none";
        } else {
            return this.a + ", " + this.b + ", " + this.c + ", " + this.d + " - from these sides you can't create "
                    +getClass().getSimpleName();
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }
}
