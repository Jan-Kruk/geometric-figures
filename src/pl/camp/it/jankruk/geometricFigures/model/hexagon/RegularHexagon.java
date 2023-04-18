package pl.camp.it.jankruk.geometricFigures.model.hexagon;

public class RegularHexagon extends Hexagon{
    public RegularHexagon(int a, int b, int c, int d, int e, int f) {
        super(a, b, c, d, e, f);
    }
    public String toString() {
            return getClass().getSimpleName() + " - sides: " + getA() +
                    ", " + getB() + ", " + getC() + ", " + getD() + ", " + getE() + ", " + getF() + " - perimeter: " +
                    calculatePerimeter() + " - area: " + String.format("%.2f",calculateArea());

    }
}
