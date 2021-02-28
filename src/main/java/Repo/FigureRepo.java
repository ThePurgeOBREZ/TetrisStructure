package Repo;

import Entity.Figure;

import java.util.ArrayList;

public class FigureRepo {
    private ArrayList<Figure> figures;

    public FigureRepo() {
    }

    public FigureRepo(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public void Figure() {
        Figure firstFigure = new Figure();
        this.figures = new ArrayList<>();
        figures.add(firstFigure);
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }
}
