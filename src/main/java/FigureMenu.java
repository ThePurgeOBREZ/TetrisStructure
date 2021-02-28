import Service.FigureService;

import java.util.Scanner;

public class FigureMenu {
    private String choice;

    private FigureService figureService;

    public FigureMenu() {
    }

    public void chooseTheAction() {
        Scanner in = new Scanner(System.in);
        switch (choice) {
            case "Space":
                figureService.roll();
                break;
            case "a":
                figureService.moveLeft();
                break;
            case "d":
                figureService.moveRight();
                break;
        }
        figureService.moveDown();
        if (!figureService.isGameOver()) {
            chooseTheAction();
        }
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

    public void isGameOver(FigureService figureService){
        figureService.isGameOver();
    }
}
