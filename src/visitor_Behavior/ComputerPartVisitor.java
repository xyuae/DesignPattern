package visitor_Behavior;

/**
 * Created by Xiaojun YU on 2017-03-17.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit (Keyboard keyboard);
    public void visit (Monitor monitor);
}
