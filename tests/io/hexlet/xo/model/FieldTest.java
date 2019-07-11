package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void getSize() throws Exception {
        final Field field = new Field();
        assertEquals(3,field.getSize());
    }

    @Test
    public void getFigure() {
    }

    @Test
    public void setFigure() throws Exception{
        Field field = new Field();
        Point point = new Point(1,2);
        field.setFigure(point,Figure.X);
        assertEquals(Figure.X,field.getFigure(point));
    }

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception{
        Field field = new Field();
        Point point = new Point(1,2);
        assertNull(field.getFigure(point));
    }
}