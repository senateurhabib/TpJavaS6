package tp;

public class CompteurNChiffresV2 {
	private int n ; 
	private int  chiffres [];
	public CompteurNChiffresV2(int n) {
		if (n<1) {
			throw new IllegalArgumentException ("le nombre doit etre superieur à zero");
		}
		this.n=n;
		this.chiffres = new int [n];
	}
	
	public String toString() {
		StringBuilder valeur = new StringBuilder();
		for(int chiffre : chiffres) {
			valeur.append(chiffre);
		}
		return valeur.toString();
		
	}
	public void incrementer()
	{
		for(int i=0 ; i<n ; i++) {
			if (chiffres[i]<9) {
				chiffres[i]++;
			}
			else {
				chiffres[i]=0;
			}
		}
	}
	public  static void main (String [] args) {
		CompteurNChiffresV2 c = new CompteurNChiffresV2 (100);
		for (int i = 0 ; i <250 ; i++) {
			c.incrementer();
		}
		System.out.println("La valeur est : "+ c);
	}

}
