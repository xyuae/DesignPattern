package PrototypeDesignPattern;

/**
 * Created by Xiaojun YU on 2017-02-20.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square:: draw() method");
    }
}
