package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {
    public Figure currentMove(Field field) throws InvalidPointException {
        int figureCount = 0;
        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                if (field.getFigure(new Point(i, j)) != null) {
                    figureCount++;
                }
            }

        }
        if (figureCount == field.getSize() * field.getSize())return null;
        if (figureCount % 2 == 0){
            return Figure.X;
        }else return Figure.O;
    }
}
