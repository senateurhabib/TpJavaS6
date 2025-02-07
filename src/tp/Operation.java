package tp;

public abstract class Operation extends Expression {
    protected Expression gauche, droite;

    public Operation(Expression gauche, Expression droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    @Override
    public String chainePostFixée() {
        return gauche.chainePostFixée() + " " + droite.chainePostFixée() + " " + getOperator();
    }

    protected abstract String getOperator();
}

