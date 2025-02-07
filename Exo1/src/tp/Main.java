package tp;

public class Main {
    public static void main(String[] args) {
        Expression exp = new Soustraction(
                new Addition(
                        new Multiplication(new Valeur(3), new Valeur(2)),
                        new Division(new Soustraction(new Valeur(6), new Valeur(2)), new Multiplication(new Valeur(5), new Valeur(1)))
                ),
                new Addition(new Valeur(2), new Valeur(1))
        );

        System.out.println("Expression : " + exp.toString());
        System.out.println("Résultat : " + exp.evaluer());
    }
}

