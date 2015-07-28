package org.bmag.models;

import org.bmag.exceptions.InvalidInputException;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        if(this.length<=0 || this.breadth<=0) {
            throw new InvalidInputException("NEGATIVE INPUTS!");
        }
        else {
            this.length = length;
            this.breadth = breadth;
        }
    }

    public int calculateArea() {
        int area;

        area = this.length*this.breadth;
        return area;
    }
}
