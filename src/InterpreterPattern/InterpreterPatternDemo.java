package InterpreterPattern;


/**
 * Created by Xiaojun YU on 2017-03-01.
 */
public class InterpreterPatternDemo {

    //Rule: Robert and John are male
    public static Expression getMaleExpression() {
        Expression reobert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("john");
        return new OrExpression(reobert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomenExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomenExpression();

        System.out.println("John is male?" + isMale.interpret("John"));
        System.out.println("Julie is married?" + isMarriedWomen.interpret("Married Julie"));
    }
}
