package homework.homework_11;

import homework.homework_7.Figure;

import java.util.Comparator;

public class FigureComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure o1, Figure o2) {
        int result = Double.compare(o1.getSquare(), o2.getSquare());
        if (result != 0) {
            return result;
        } else return Double.compare(o1.getPerimeter(), o2.getPerimeter());
    }

}

