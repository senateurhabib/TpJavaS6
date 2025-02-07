package tp;

public class Multiplication extends Operation {
    public Multiplication(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public int evaluer() {
        return gauche.evaluer() * droite.evaluer();
    }

    @Override
    public String toString() {
        return "(" + gauche.toString() + " * " + droite.toString() + ")";
    }

    @Override
    protected String getOperator() {
        return "*";
    }
}
