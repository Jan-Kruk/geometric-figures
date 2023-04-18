package pl.camp.it.jankruk.geometricFigures.gui;

import pl.camp.it.jankruk.geometricFigures.db.FiguresDB;
import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;
import pl.camp.it.jankruk.geometricFigures.model.circle.Circle;
import pl.camp.it.jankruk.geometricFigures.model.hexagon.Hexagon;
import pl.camp.it.jankruk.geometricFigures.model.hexagon.RegularHexagon;
import pl.camp.it.jankruk.geometricFigures.model.pentagon.Pentagon;
import pl.camp.it.jankruk.geometricFigures.model.pentagon.RegularPentagon;
import pl.camp.it.jankruk.geometricFigures.model.quadrangle.Quadrangle;
import pl.camp.it.jankruk.geometricFigures.model.quadrangle.Rectangle;
import pl.camp.it.jankruk.geometricFigures.model.quadrangle.Square;
import pl.camp.it.jankruk.geometricFigures.model.triangle.EquilateralTriangle;
import pl.camp.it.jankruk.geometricFigures.model.triangle.IsoscelesTriangle;
import pl.camp.it.jankruk.geometricFigures.model.triangle.Triangle;

import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenu(){
        System.out.println("Hello! In this program you can calculate perimeter and area of 5 figures of your choose " +
                "triangle, rectangle, pentagon, hexagon");
        System.out.println("Input sides from 3 to 6 depends on figure type");
        System.out.println("Here is an example how to input rectangle - square: 4 4 4 4 ");
        System.out.println("Please input how many figures you would like to generate: ");
        return scanner.nextLine();
    }
    public static String askForUserInput(int i){
        System.out.println("Please input " + i + " figure:");
        return scanner.nextLine();
    }
    public static boolean checkSyntax(String[] input){
        for (String e: input) {
            if(!e.matches("[0-9]") && !(Integer.parseInt(e) > 0) || input.length == 2  || input.length > 6){
                System.out.println("Wrong input! Please enter numbers bigger than 0 and proper syntax for example: 2 2 2 2 2 2.");
                return true;
            }
        }
        return false;
    }
    public static GeometricFigure chooseTriangle(String[] input){
        if (input[0].equals(input[1]) && input[1].equals(input[2])) {
            return new EquilateralTriangle(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]));
        }else if (input[0].equals(input[1]) || input[1].equals(input[2]) || input[0].equals(input[2])){
            return new IsoscelesTriangle(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]));
        }else {
            return new Triangle(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]));
        }
    }
    public static GeometricFigure chooseQuadrangle(String[] input){
        if (input[0].equals(input[1]) && input[1].equals(input[2]) && input[2].equals(input[3])){
            return new Square(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]),Integer.parseInt(input[3]));
        }else if (input[0].equals(input[2]) && input[1].equals(input[3])){
            return new Rectangle(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]),Integer.parseInt(input[3]));
        }else{
            return new Quadrangle(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]),Integer.parseInt(input[3]));
        }
    }
    public static GeometricFigure choosePentagon(String[] input){
        if(input[0].equals(input[1]) && input[1].equals(input[2]) && input[2].equals(input[3]) && input[3].equals(input[4])){
            return new RegularPentagon(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]),Integer.parseInt(input[3]),Integer.parseInt(input[4]));
        }else{
            return new Pentagon(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]),Integer.parseInt(input[3]),Integer.parseInt(input[4]));
        }
    }
    public static GeometricFigure chooseHexagon(String[] input){
        if(input[0].equals(input[1]) && input[1].equals(input[2]) && input[2].equals(input[3])
                && input[3].equals(input[4]) && input[4].equals(input[5])){
            return new RegularHexagon(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]),Integer.parseInt(input[3]),Integer.parseInt(input[4]),
                    Integer.parseInt(input[5]));
        }else{
            return new Hexagon(Integer.parseInt(input[0]),Integer.parseInt(input[1])
                    ,Integer.parseInt(input[2]),Integer.parseInt(input[3]),Integer.parseInt(input[4]),
                    Integer.parseInt(input[5]));
        }

    }
    public static GeometricFigure chooseCircle(String[] input){
        return new Circle(Integer.parseInt(input[0]));
    }
}
