package PrototypeDesignPattern;

/**
 * Created by Xiaojun YU on 2017-02-20.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle:: draw() method");
    }
}
