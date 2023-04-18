package pl.camp.it.jankruk.geometricFigures.core;

import pl.camp.it.jankruk.geometricFigures.db.FiguresDB;
import pl.camp.it.jankruk.geometricFigures.gui.GUI;
import pl.camp.it.jankruk.geometricFigures.model.GeometricFigure;
import pl.camp.it.jankruk.geometricFigures.model.triangle.Triangle;

import java.util.Arrays;
import java.util.Scanner;

public class Core {

    public static void start() {
        FiguresDB figuresDB = new FiguresDB(Integer.parseInt(GUI.showMenu()));
        for (int i = 0; i < figuresDB.getFiguresArray().length; i++) {
            String[] input = GUI.askForUserInput(i+1).split(" ");
            if(GUI.checkSyntax(input)){
                input = null;
            }
            if (input == null){
                figuresDB.setFigureInArray(i,null);
            }else{
                switch (input.length){
                    case 1:
                        figuresDB.setFigureInArray(i, GUI.chooseCircle(input));
                        break;
                    case 3:
                        figuresDB.setFigureInArray(i,GUI.chooseTriangle(input));
                        break;
                    case 4:
                        figuresDB.setFigureInArray(i, GUI.chooseQuadrangle(input));
                        break;
                    case 5:
                        figuresDB.setFigureInArray(i, GUI.choosePentagon(input));
                        break;
                    case 6:
                        figuresDB.setFigureInArray(i,GUI.chooseHexagon(input));
                        break;
                }
            }

        }
        for (GeometricFigure element: figuresDB.getFiguresArray()){
            if (element == null){
                System.out.println("Wrong input were given!!");
            }else{
                System.out.println(element);
            }
        }
        }

    }

