package pl.camp.it.jankruk.geometricFigures.model.circle;

import pl.camp.it.jankruk.geometricFigures.model.Const;
import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;

public class Circle implements GeometricFigure {
    private int a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        return (int)(2 * Const.PI * a);
    }

    @Override
    public boolean checkIfFigureCorrect() {
        return false;
    }

    @Override
    public double calculateArea() {
        return Const.PI*a*a;
    }
    @Override
    public String toString(){
        return  getClass().getSimpleName() + " - radius: " + this.a + " - perimeter: " +
                calculatePerimeter() + " - area: " + String.format("%.2f",calculateArea());
    }

}
