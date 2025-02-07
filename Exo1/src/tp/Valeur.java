package tp;

public class Valeur extends Expression {
    private int valeur;

    public Valeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public int evaluer() {
        return this.valeur;
    }

    @Override
    public String toString() {
        return String.valueOf(this.valeur);
    }
}
