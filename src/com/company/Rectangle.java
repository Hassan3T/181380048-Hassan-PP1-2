package com.company;

public class Rectangle {
    private double width;
    private double height;

    Rectangle(){
        width=8;
        height=5;

    }
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public  double getArea(){
        return  (height*width);
    }
    public  double getPerimeter(){
        return  2*(getHeight()+getWidth());
    }
}

