package pl.camp.it.jankruk.geometricFigures.db;

import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;

public class FiguresDB {
   private int arrayLength;
   private GeometricFigure[] figuresArray;
   public FiguresDB(int arrayLength) {
      this.arrayLength = arrayLength;
      figuresArray = new GeometricFigure[this.arrayLength];
   }

   public GeometricFigure[] getFiguresArray() {
      return figuresArray;
   }

   public void setFigureInArray(int id,GeometricFigure object) {
      getFiguresArray()[id] = object;
   }
}
