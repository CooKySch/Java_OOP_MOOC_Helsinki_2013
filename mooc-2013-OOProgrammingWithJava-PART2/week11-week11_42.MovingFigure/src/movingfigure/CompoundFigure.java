package movingfigure;

import java.awt.*;
import java.util.ArrayList;

public class CompoundFigure extends Figure {
    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public CompoundFigure() {
        super(0, 0);
    }

    public void add(Figure f) {
        this.figures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : figures) {
            figure.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure figure : figures) {
            figure.move(dx, dy);
        }
    }
}
