package org.bmag.tests;

import org.bmag.exceptions.InvalidInputException;
import org.bmag.models.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test(expected = InvalidInputException.class)
    public void testInvalidInputs() {
        Rectangle rect1 = new Rectangle(-1, 1);
    }

    @Test
    public void testAreaOfRectangle() {

        Rectangle rect1 = new Rectangle(1, 1);

        int expectedArea = 1;
        int calculatedArea = rect1.calculateArea();

        assertEquals(expectedArea, calculatedArea);
    }

    @Test
    public void testPerimeterOfRectangle() {

        Rectangle r = new Rectangle(1, 1);

        int expPerim = 2;
        int calculatedPerim = r.calculatePerimeter();

        assertEquals(expPerim, calculatedPerim);
    }
    
}