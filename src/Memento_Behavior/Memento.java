package Memento_Behavior;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiaojun YU on 2017-03-16.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

