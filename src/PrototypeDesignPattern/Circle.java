package PrototypeDesignPattern;

/**
 * Created by Xiaojun YU on 2017-02-20.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle:: draw() method");
    }
}
