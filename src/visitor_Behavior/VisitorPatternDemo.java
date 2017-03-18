package visitor_Behavior;

/**
 * Created by Xiaojun YU on 2017-03-18.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
