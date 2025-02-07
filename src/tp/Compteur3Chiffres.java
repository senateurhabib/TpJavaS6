package tp;

public class Compteur3Chiffres {
	private int nbkillometre;
    private int  compteur;
	public Compteur3Chiffres() {
		this.nbkillometre = nbkillometre;
	}
	public void  incrementer() {
		if (this.nbkillometre <999) {
			nbkillometre ++;
		}
		else {
			nbkillometre =0;
		}
	}
	
	public String toString() {
		return String.format("%03d",nbkillometre);
	}
	
	public static void main(String [] args) {
		Compteur3Chiffres c = new Compteur3Chiffres();
		for (int i = 0 ; i<2000 ;i++) {
			c.incrementer();
		}
		System.out.println("la valeur est :"+c.toString());
	}

}
