package tp;

public class Soustraction extends Operation {
    public Soustraction(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public int evaluer() {
        return gauche.evaluer() - droite.evaluer();
    }

    @Override
    public String toString() {
        return "(" + gauche.toString() + " - " + droite.toString() + ")";
    }

    @Override
    protected String getOperator() {
        return "-";
    }
}


