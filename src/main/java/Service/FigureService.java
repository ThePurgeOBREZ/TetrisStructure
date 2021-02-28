package Service;

import Entity.Figure;
import Entity.Movable;
import Repo.FigureRepo;

public class FigureService implements Movable {
    private FigureRepo figureRepo;

    public FigureService() {
    }

    public void moveRight() {
    }

    public void moveDown() {
    }

    public void moveLeft() {
    }

    public void roll() {
    }

    public void add(Figure figure){
        figureRepo.add(figure);
    }
}
