package pl.camp.it.jankruk.geometricFigures.model.pentagon;

public class Pentagon extends RegularPentagon {
    public Pentagon(int a, int b, int c, int d, int e) {
        super(a, b, c, d, e);
    }

    @Override
    public String toString() {
        if (super.checkIfFigureCorrect()){
            return getClass().getSimpleName() + " - sides: " + getA() +
                    ", " + getB() + ", " + getC() + ", " + getD() + ", "  + getE() + " - perimeter: " +
                    calculatePerimeter() + " - area: " + "none";
        }else{
            return getA() + ", " + getB() + ", " + getC() + ", " + getD() + ", "  + getE() +" - from these sides you can't create "
                    +getClass().getSimpleName();
        }

    }
}
