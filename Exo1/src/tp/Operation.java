package tp;

public abstract class Operation extends Expression {
    protected Expression gauche, droite;

    public Operation(Expression gauche, Expression droite) {
        this.gauche = gauche;
        this.droite = droite;
    }
}
