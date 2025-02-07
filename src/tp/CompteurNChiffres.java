package tp;
import java.util.Scanner;

public class CompteurNChiffres {
	private int maxvaleur;
	private int n;
	private int nbkillomettre;
	public CompteurNChiffres(int n) {
		if (n<1){
			throw new IllegalArgumentException("Le nombre doit etre superieur ou egal à  1 "); 
		}
		else
		{
		this.n= n;
		this.maxvaleur = (int) Math.pow(10,n)-1;
		this.nbkillomettre = 0;}
	}
	
	public void incrementer() {
		if (nbkillomettre < maxvaleur) {
			nbkillomettre++;
		}
		else {
			nbkillomettre = 0;
		}
	}
	public String toString() {
		return String.format("%0"+n+"d",this.nbkillomettre);
	}
	public static void main(String [] args) {
		Scanner clavier = new Scanner(System.in);
		int n = Integer.parseInt(clavier.nextLine());
		
		CompteurNChiffres c = new CompteurNChiffres(n);
		for (int i = 0 ; i<250 ; i++) {
			c.incrementer();
		}
		System.out.println("la valeur est "+c.toString());
		
	}
}
