package visitor_Behavior;

/**
 * Created by Xiaojun YU on 2017-03-18.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying COmputer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying MOuse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
