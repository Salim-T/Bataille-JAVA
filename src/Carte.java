import java.util.Random;

public class Carte {
	private int[] valeurs = new int[14];
	private String[] couleurs = {"Coeur","carreau","trèfle","pique"};
	private int valeur;
	private String couleur;
	
	public Carte() {
		Random rd = new Random();
		Random rd2 = new Random();
		this.valeur = valeurs[rd.nextInt(valeurs.length)];
		this.couleur = couleurs[rd2.nextInt(couleurs.length)];	
	}
	
	public int getValeur() {	
		return valeur;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public String toString(){
		return valeur + " de "+ couleur;
	}
	
	//Comparer une carte
	
	public String compare(Carte c) {
		Carte c2 = new Carte();
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
