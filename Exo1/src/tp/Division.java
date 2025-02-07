package tp;

public class Division extends Operation {
    public Division(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public int evaluer() {
        if (droite.evaluer() == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return gauche.evaluer() / droite.evaluer();
    }

    @Override
    public String toString() {
        return "(" + gauche.toString() + " / " + droite.toString() + ")";
    }
}
