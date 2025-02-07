package tp;

public class Addition extends Operation {
    public Addition(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public int evaluer() {
        return gauche.evaluer() + droite.evaluer();
    }

    @Override
    public String toString() {
        return "(" + gauche.toString() + " + " + droite.toString() + ")";
    }
}
