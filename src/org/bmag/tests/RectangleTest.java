package org.bmag.tests;

import org.bmag.exceptions.InvalidInputException;
import org.bmag.models.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testAreaOfRectangle() {

        Rectangle rect1 = new Rectangle(1, 1);

        int expectedArea = 1;
        int calculatedArea = rect1.calculateArea();

        assertEquals(expectedArea, calculatedArea);
    }

    @Test(expected = InvalidInputException.class)
    public void testInvalidInputs() {
        Rectangle rect1 = new Rectangle(-1, 1);
    }

}