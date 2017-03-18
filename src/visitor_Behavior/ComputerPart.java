package visitor_Behavior;

/**
 * Created by Xiaojun YU on 2017-03-17.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
