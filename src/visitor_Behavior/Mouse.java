package visitor_Behavior;

/**
 * Created by Xiaojun YU on 2017-03-18.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
