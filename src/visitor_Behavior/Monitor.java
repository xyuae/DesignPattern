package visitor_Behavior;

/**
 * Created by Xiaojun YU on 2017-03-17.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
