package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {
    public Figure currentMove(Field field) {

        int figureCount = 0;
        for (int i = 0; i < field.getSize(); i++) {
                figureCount+= countFiguresInTheRow(field,i);
        }
        if (figureCount == field.getSize() * field.getSize()) return null;
        if (figureCount % 2 == 0) {
            return Figure.X;
        } else return Figure.O;
    }

    private int countFiguresInTheRow(final Field field, final int row) {
        int figureCount = 0;
        for (int j = 0; j < field.getSize(); j++) {
            try {
                if (field.getFigure(new Point(j, row)) != null) {
                    figureCount++;
                }
            } catch (InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return figureCount;
    }
}
