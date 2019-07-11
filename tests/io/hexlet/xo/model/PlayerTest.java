package io.hexlet.xo.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void getName() {
        final String inputName = "Serge";
        final String expextedValue = inputName;

        final Player player = new Player(inputName, null);

        final String actualValue = player.getName();

        assertEquals(expextedValue, actualValue);
    }

    @Test
    public void getFigure() {
        final Figure inputFigure = Figure.X;
        final Figure expectedValue = inputFigure;

        final Player player = new Player(null, inputFigure);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }
}