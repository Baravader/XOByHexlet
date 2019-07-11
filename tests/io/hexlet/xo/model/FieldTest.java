package io.hexlet.xo.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void getSize() {
        final Field field = new Field();
        assertEquals(3,field.getSize());
    }

    @Test
    public void getFigure() {
    }

    @Test
    public void setFigure() {
        Field field = new Field();
        Point point = new Point(1,2);
        field.setFigure(point,Figure.X);
        assertEquals(Figure.X,field.getFigure(point));
    }
}