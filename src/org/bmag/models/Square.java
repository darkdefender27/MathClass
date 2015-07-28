package org.bmag.models;

import org.bmag.exceptions.InvalidInputException;

public class Square implements Shape {

    private int side;

    public Square(int side){
        if(side <=0 ) {
            throw new InvalidInputException("Invalid INPUTS!");
        }
        else {
            this.side = side;
        }
    }

    @Override
    public int calculateArea() {
        return side*side;
    }

    @Override
    public int calculatePerimeter() {
        return side+side;
    }
}
