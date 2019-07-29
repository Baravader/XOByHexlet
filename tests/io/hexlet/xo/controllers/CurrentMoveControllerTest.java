package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class CurrentMoveControllerTest {

    @Test
    public void currentMoveWhenNextMoveIsO() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.O);
            field.setFigure(new Point(2, 2), Figure.X);
            assertEquals(Figure.O, currentMoveController.currentMove(field));
        }

    }
    @Test
    public void currentMoveWhenNextMoveIsX() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.O);
            assertEquals(Figure.X, currentMoveController.currentMove(field));
        }

    }

    @Test
    public void currentMoveIsNothing() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        final Field field = new Field(3);
        for (int i = 0; i < 3; i++) {
            fullFieldRandomiser(field);
            assertNull(currentMoveController.currentMove(field));
        }

    }


    private Field fullFieldRandomiser(Field field) throws InvalidPointException {
        final ArrayList<Figure> figures = new ArrayList();
        Random random = new Random();
        figures.add(Figure.X);
        figures.add(Figure.O);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                field.setFigure(new Point(x,y),figures.get(random.nextInt(2)));
            }
        }
        return field;
    }
}