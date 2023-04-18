package pl.camp.it.jankruk.geometricFigures.model.hexagon;

import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;

public class Hexagon implements GeometricFigure {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public Hexagon(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public int calculatePerimeter() {
        return a+b+c+d+e+f;
    }

    @Override
    public double calculateArea() {
        return ((double) 3 /2)*Math.pow(a,2*Math.sqrt(3));
    }

    @Override
    public boolean checkIfFigureCorrect() {
        return a+b+c+e+f > d && a+d+c+e+f >b && a+d+b+e+f >c && c+d+b+e+f>a && c+d+b+a+f>e && c+d+b+a+e>f;
    }
    @Override
    public String toString() {
        if(checkIfFigureCorrect()){
            return getClass().getSimpleName() + " - sides: " + this.a +
                    ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f +" - perimeter: " +
                    calculatePerimeter() + " - area: " + "none";
        } else {
            return this.a + ", " + this.b + ", " + this.c + ", " + this.d  + ", " + this.e + ", " + this.f
                    +" - from these sides you can't create "
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

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
}
