package pl.camp.it.jankruk.geometricFigures.model.quadrangle;

public class Rectangle extends Quadrangle{
    public Rectangle(int a, int b, int c, int d) {
        super(a, b, c, d);
    }


    @Override
    public double calculateArea() {
        return getA()*getC();
    }

    @Override
    public String toString() {
        if (checkIfFigureCorrect()){
        return getClass().getSimpleName() + " - sides: " + getA() +
                ", " + getB() + ", " + getC() + ", " + getD()+" - perimeter: " +
                calculatePerimeter() + " - area: " + String.format("%.2f",calculateArea());
        } else {
            return getA() + ", " + getB() + ", " + getC() + ", " + getD() + " - from these sides you can't create "
                    +getClass().getSimpleName();
        }
    }
}
