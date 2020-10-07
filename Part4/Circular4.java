package com.Part4;

public class Circular4 {
    Circle bottom;
    double height;
    public void setBottom(Circle c){
        this.bottom=c;
    }

    public void setHeight(double h) {
        this.height = h;
    }
    double getVolume(){
        return bottom.getArea()*height/3.0;
    }
}

