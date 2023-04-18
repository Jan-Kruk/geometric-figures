package pl.camp.it.jankruk.geometricFigures.model.pentagon;

import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;

public class RegularPentagon implements GeometricFigure {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public RegularPentagon(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public int calculatePerimeter() {
        return a+b+c+d+e;
    }

    @Override
    public double calculateArea() {
        return ((((double) a)*((double) a))/4)*Math.sqrt(25+10*Math.sqrt(5));
    }

    @Override
    public boolean checkIfFigureCorrect() {
        return a+b+c+e > d && a+d+c+e >b && a+d+b+e >c && c+d+b+e>a && c+d+b+a>e;
    }
    @Override
    public String toString() {
        if(checkIfFigureCorrect()){
        return getClass().getSimpleName() + " - sides: " + this.a +
                ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + " - perimeter: " +
                calculatePerimeter() + " - area: " + String.format("%.2f",calculateArea());
        } else {
            return this.a + ", " + this.b + ", " + this.c + ", " + this.d  + ", " + this.e +" - from these sides you can't create "
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
}
