package Entity;

public class Figure {
    private int length, width;
    private String color;
    private FigureForm figureForm;

    public Figure(int length, int width, String color, FigureForm figureForm) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.figureForm = figureForm;
    }

    public Figure() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FigureForm getFigureForm() {
        return figureForm;
    }

    public void setFigureForm(FigureForm figureForm) {
        this.figureForm = figureForm;
    }
}
