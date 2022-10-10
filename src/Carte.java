import java.util.ArrayList;
import java.util.Random;

public class Carte {
	private int[] valeurs = new int[14];
	private String[] couleurs = {"Coeur","carreau","trèfle","pique"};
	private int valeur;
	private int couleur;
	
	public Carte(int valeur, int couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
//		Random rd = new Random();
//		Random rd2 = new Random();
//		this.valeur = valeurs[rd.nextInt(valeurs.length)];
//		this.couleur = couleurs[rd2.nextInt(couleurs.length)];	
	}
	
	public int getValeur() {	
		return valeur;
	}
	
	public int getCouleur() {
		return couleur;
	}
	
	public String toString(){
		return valeur + " de "+ couleur;
	}
	
	//Comparer une carte
	
	public String compare(Carte c) {
		Carte c2 = new Carte(valeur,couleur);
		String result;
		if(this.valeur > c2.valeur) {
			result = "la carte" + this+ " est plus haute";
		}
		else if(this.valeur < c2.valeur){
			result = "la carte" + c2 + " est plus haute";
		}
		else {
			result = "égalité. Rejouez une carte";
		}
		
		return result;
	}
}
