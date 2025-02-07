package tp;

public class Negation extends Expression {
    private Expression exp;

    public Negation(Expression exp) {
        this.exp = exp;
    }

    @Override
    public int evaluer() {
        return -exp.evaluer();
    }

    @Override
    public String toString() {
        return "-(" + exp.toString() + ")";
    }
}
