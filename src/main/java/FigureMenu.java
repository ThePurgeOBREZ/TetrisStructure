import Service.FigureService;

import java.util.Scanner;

public class FigureMenu {
    private String choice;

    private FigureService figureService;

    public FigureMenu() {
    }

    public void chooseTheAction() {
        Scanner in = new Scanner(System.in);
        if (choice == "Space") {
            figureService.roll();
        } else if (choice == "a") {
            figureService.moveLeft();
        } else if (choice == "d") {
            figureService.moveRight();
        }
        figureService.moveDown();
        chooseTheAction();
    }

    public void roll(FigureService figureService){
        figureService.roll();
    }

    public void moveLeft(FigureService figureService){
        figureService.moveLeft();
    }

    public void moveRight(FigureService figureService){
        figureService.moveRight();
    }

    public void moveDown(FigureService figureService){
        figureService.moveDown();
    }
}
