package org.bmag.tests;

import org.bmag.exceptions.InvalidInputException;
import org.bmag.models.Square;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test(expected = InvalidInputException.class)
    public void testInvalidInputs() {
        Square s = new Square(-1);
    }

    @Test
    public void testCalculateArea() throws Exception {
        Square sq = new Square(1);
        assertEquals(1, sq.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() throws Exception {
        Square sq = new Square(1);
        assertEquals(2, sq.calculatePerimeter());
    }
}