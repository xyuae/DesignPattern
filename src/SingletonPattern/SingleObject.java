package SingletonPattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class SingleObject {
    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be instantiated
    private SingleObject(){}

    // Get the only objecr avaialble
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello world!");
    }
}
